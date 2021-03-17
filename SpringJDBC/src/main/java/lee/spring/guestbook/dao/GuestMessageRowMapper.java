package lee.spring.guestbook.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import lee.spring.guestbook.vo.GuestMessage;

// 목록 조회 시 사용할 RowMapper 클래스
public class GuestMessageRowMapper implements RowMapper<GuestMessage> {

	@Override
	public GuestMessage mapRow(ResultSet rs, int rowNum) throws SQLException {
		GuestMessage message = new GuestMessage();
		message.setId(rs.getInt("message_id"));
		message.setGuestName(rs.getString("guest_name"));
		message.setMessage(rs.getString("message"));
		message.setRegistryDate(rs.getDate("registry_date"));
		return message;
	}

}
