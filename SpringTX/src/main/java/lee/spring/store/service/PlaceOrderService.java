package lee.spring.store.service;

import lee.spring.store.vo.ItemNotFoundException;
import lee.spring.store.vo.PurchaseOrderRequest;
import lee.spring.store.vo.PurchaseOrderResult;

// 구매서비스를 추상화한 PlaceOrderService 인터페이스
public interface PlaceOrderService {
	public PurchaseOrderResult order(PurchaseOrderRequest orderRequest) 
			throws ItemNotFoundException;
}
