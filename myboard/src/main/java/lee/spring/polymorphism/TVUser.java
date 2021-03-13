package lee.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// [각 클래스 객체 생셩]
		//SamsungTV tv = new SamsungTV();
		//LgTv tv = new LgTv();
		
		// [인터페이스 상속] 
		//TV tv = new LgTv();
		//TV tv = new SamsungTv();

		// [팩토리 패턴 활용] : 팩토리 클래스 별도 생성
		// --> 기존의 코드를 건드리지 않고 추가적인 기능을 생성
		//BeanFactory factory = new BeanFactory();
		
		// 1.Spring container를 구동
		AbstractApplicationContext factory = 
				//new GenericXmlApplicationContext("applicationContext.xml");
				new GenericXmlApplicationContext("applicationContext2.xml");

		// 2.Spring 컨테이너로부터 필요한 객체를 요청(lookup)
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		// 3.Spring container를 종료
		factory.close(); 
	}
}
