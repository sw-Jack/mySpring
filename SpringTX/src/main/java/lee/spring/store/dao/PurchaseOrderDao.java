package lee.spring.store.dao;

import lee.spring.store.vo.PurchaseOrder;

// 구매 주문 결과를 저장해 줄 인터페이스
public interface PurchaseOrderDao {
	void insert(PurchaseOrder order);
}
