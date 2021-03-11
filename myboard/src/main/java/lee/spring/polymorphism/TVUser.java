package lee.spring.polymorphism;

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
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
