package lee.spring.store.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import lee.spring.store.dao.ItemDao;
import lee.spring.store.dao.PaymentInfoDao;
import lee.spring.store.dao.PurchaseOrderDao;
import lee.spring.store.vo.Item;
import lee.spring.store.vo.ItemNotFoundException;
import lee.spring.store.vo.PaymentInfo;
import lee.spring.store.vo.PurchaseOrder;
import lee.spring.store.vo.PurchaseOrderRequest;
import lee.spring.store.vo.PurchaseOrderResult;

// 구매 서비스를 실제로 구현한 클래스2
public class PlaceOrderServiceImplTwo implements PlaceOrderService {

	private ItemDao itemDao;
	private PaymentInfoDao paymentInfoDao;
	private PurchaseOrderDao purchaseOrderDao;
	private TransactionTemplate transactionTemplate;

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public void setPaymentInfoDao(PaymentInfoDao paymentInformationDao) {
		this.paymentInfoDao = paymentInformationDao;
	}

	public void setPurchaseOrderDao(PurchaseOrderDao purchaseOrderDao) {
		this.purchaseOrderDao = purchaseOrderDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
	public PurchaseOrderResult order(final PurchaseOrderRequest orderRequest) throws ItemNotFoundException {
		return transactionTemplate.execute(new TransactionCallback<PurchaseOrderResult>() {
			@Override
			public PurchaseOrderResult doInTransaction(TransactionStatus status) {
				Item item = itemDao.findById(orderRequest.getItemId());
				if (item == null)
					throw new ItemNotFoundException(orderRequest.getItemId());
				PaymentInfo paymentInfo = new PaymentInfo(item.getPrice());
				paymentInfoDao.insert(paymentInfo);
				PurchaseOrder order = new PurchaseOrder(item.getId(), orderRequest.getAddress(), paymentInfo.getId());
				purchaseOrderDao.insert(order);
				return new PurchaseOrderResult(item, paymentInfo, order);
			}
		});
	}
}
