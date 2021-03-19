package lee.spring.store.dao.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import lee.spring.store.dao.PurchaseOrderDao;
import lee.spring.store.vo.PurchaseOrder;

// PurchaseOrderDao 인터페이스를 구현한 클래스
public class JdbcPurchaseOrderDao implements PurchaseOrderDao {

	private SimpleJdbcInsert insert;
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	public JdbcPurchaseOrderDao(SimpleJdbcInsert insert) {
		this.insert = insert;
		insert.withTableName("purchase_order").usingColumns("purchase_order_id", "item_id", "payment_info_id", "address");
	}

	public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
	}

	public int nextVal() {
		Map<String, Object> emptyMap = new HashMap<String, Object>();
		return namedJdbcTemplate.queryForObject("select purchase_seq.nextval from dual", emptyMap, Integer.class);
	}

	@Override
	public void insert(PurchaseOrder order) {
		Map<String, Object> args = new HashMap<String, Object>();
		order.setId(nextVal());
		args.put("purchase_order_id", order.getId());
		args.put("item_id", order.getItemId());
		args.put("payment_info_id", order.getPaymentInfoId());
		args.put("address", order.getAddress());
		insert.execute(args);
	}
}
