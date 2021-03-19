package lee.spring.store.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import lee.spring.store.dao.ItemDao;
import lee.spring.store.vo.Item;

//ItemDao 인터페이스를 구현한 클래스
public class JdbcItemDao implements ItemDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcItemDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Item findById(Integer itemId) {
		return jdbcTemplate.queryForObject("select * from item where item_id = ?",
				new RowMapper<Item>() {
					@Override
					public Item mapRow(ResultSet rs, int row) throws SQLException {
						Item item = new Item();
						item.setId(rs.getInt("item_id"));
						item.setPrice(rs.getInt("price"));
						return item;
					}
				},
				new Object[] { itemId });
	}
}
