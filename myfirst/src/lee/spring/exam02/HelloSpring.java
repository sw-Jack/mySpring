package lee.spring.exam02;

// 인터페이스를 활용해 결합도(클래스간 의존 관계)를 약하게 설정하기
// 메인 코드 : 기능 추가 개념
// 인터페이스 상속을 통해 기존 코드는 건들지 않고 새로운 기능을 추가하게됨
public class HelloSpring {

	public static void main(String[] args) {
		// 기능 1 
		MyBean bean1 = new MyBeanOne();
		bean1.sayHello("Spring");
		
		// 기능 2 
		MyBean bean2 = new MyBeanTwo();
		bean2.sayHello("Spring");
	}
}
