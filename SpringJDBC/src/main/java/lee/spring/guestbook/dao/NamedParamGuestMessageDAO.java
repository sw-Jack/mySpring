package lee.spring.guestbook.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import lee.spring.guestbook.vo.GuestMessage;

//NamedParameterJdbcTemplate를 이용한 DAO 클래스
public class NamedParamGuestMessageDAO implements GuestMessageDAO {

	private NamedParameterJdbcTemplate template;

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int count() {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		return template.queryForObject("select count(*) from guestbook", paramMap, Integer.class);
	}

	@Override
	public int delete(int id) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);
		return template.update("delete from guestbook where message_id = :id", paramMap);
	}

	@Override
	public int insert(GuestMessage message) {
		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(message);
		int insertedCount = template
				.update("insert into guestbook " + "(message_id, guest_name, message, registry_date)"
						+ " values(guest_seq.nextval, :guestName, :message, :registryDate)", paramSource);
		if (insertedCount > 0) {
			int id = template.queryForObject("select count(*) from guestbook", Collections.<String, Object>emptyMap(),
					Integer.class);
			message.setId(id);
		}
		return insertedCount;
	}

	@Override
	public List<GuestMessage> select(int begin, int end) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startRowNum", begin);
		paramMap.put("count", end - begin + 1);
		return template.query("select * from (select ROWNUM rnum, MESSAGE_ID, "
				+ "guest_name, message, registry_date from " + "(select * from guestbook order by message_id desc)) "
				+ "where rnum>=:startRowNum and rnum<=:count", paramMap, new RowMapper<GuestMessage>() {
					@Override
					public GuestMessage mapRow(ResultSet rs, int rowNum) throws SQLException {
						GuestMessage message = new GuestMessage();
						message.setId(rs.getInt("message_id"));
						message.setGuestName(rs.getString("guest_name"));
						message.setMessage(rs.getString("message"));
						message.setRegistryDate(rs.getDate("registry_date"));
						return message;
					}
				});
	}

	@Override
	public int update(GuestMessage message) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("message", message.getMessage());
		paramSource.addValue("id", message.getId(), Types.INTEGER);
		return template.update("update guestbook set message = :message" + " where message_id = :id", paramSource);
	}
}
