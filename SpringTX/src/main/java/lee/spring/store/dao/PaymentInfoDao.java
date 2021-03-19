package lee.spring.store.dao;

import lee.spring.store.vo.PaymentInfo;

// 결제 정보를 저장해줄 인터페이스
public interface PaymentInfoDao {
	void insert(PaymentInfo paymentInfo);
}
