package lee.spring.exam03;

// 인터페이스를 활용해 결합도(클래스간 의존 관계)를 약하게 설정하기
// MyBean 인터페이스 구현
public class MyBeanOne implements MyBean {

	@Override
	public void sayHello(String name) { // 
		System.out.println("Hello, " + name + "!!!");
	}
}
