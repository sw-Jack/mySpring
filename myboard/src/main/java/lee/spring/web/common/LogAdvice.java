package lee.spring.web.common;

// OOP를 활용한 공통 기능 처리 : 공통 코드 양산 과정
// 공통으로 처리할 로직을 정의한 클래스
public class LogAdvice {
	public void beforeLog() {
		System.out.println("[로그] 비즈니스 로직 수행 전 동작");
	}
	
	public void afterLog() {
		System.out.println("[로그] 예외 발생 유무와 관게없이 비즈니스 로직 수행 후 동작");
	}
	
	public void afterReturningLog() {
		System.out.println("[로그] 예외없이 비즈니스 로직 수행 성공 후 동작");
	}
	
	public void afterThrowingLog() {
		System.out.println("[로그] 예외 발생시 동작");
	}
}
