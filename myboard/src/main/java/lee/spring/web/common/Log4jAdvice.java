package lee.spring.web.common;

//OOP를 활용한 공통 기능 처리 : 공통 코드 양산 과정
//공통으로 처리할 로직을 정의한 클래스
//로그 기능이 향상된 클래스
public class Log4jAdvice {
	public void printLogging() {
		System.out.println("[로그 - Log4jAdvice] 비즈니스 로직 수행 전 동작");
	}
}
