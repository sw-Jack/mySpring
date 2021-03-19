package lee.spring.store.service;

import lee.spring.store.dao.ItemDao;
import lee.spring.store.dao.PaymentInfoDao;
import lee.spring.store.dao.PurchaseOrderDao;
import lee.spring.store.vo.Item;
import lee.spring.store.vo.ItemNotFoundException;
import lee.spring.store.vo.PaymentInfo;
import lee.spring.store.vo.PurchaseOrder;
import lee.spring.store.vo.PurchaseOrderRequest;
import lee.spring.store.vo.PurchaseOrderResult;

// 구매서비스를 실제로 구현한 PlaceOrderServiceImplOne 클래스
public class PlaceOrderServiceImplOne implements PlaceOrderService {

	private ItemDao itemDao;
	private PaymentInfoDao paymentInfoDao;
	private PurchaseOrderDao purchaseOrderDao;

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public void setPaymentInfoDao(PaymentInfoDao paymentInformationDao) {
		this.paymentInfoDao = paymentInformationDao;
	}

	public void setPurchaseOrderDao(PurchaseOrderDao purchaseOrderDao) {
		this.purchaseOrderDao = purchaseOrderDao;
	}

	@Override
	public PurchaseOrderResult order(PurchaseOrderRequest orderRequest) throws ItemNotFoundException {
		Item item = itemDao.findById(orderRequest.getItemId());
		if (item == null)
			throw new ItemNotFoundException(orderRequest.getItemId());
		PaymentInfo paymentInfo = new PaymentInfo(item.getPrice());
		paymentInfoDao.insert(paymentInfo);
		PurchaseOrder order = new PurchaseOrder(item.getId(), orderRequest.getAddress(), paymentInfo.getId());
		purchaseOrderDao.insert(order);
		return new PurchaseOrderResult(item, paymentInfo, order);
	}
}
