package lee.spring.web.common;

// OOP를 활용한 공통 기능 처리 : 공통 코드 양산 과정
// 공통으로 처리할 로직을 정의한 클래스
public class LogAdvice {
	public void printLog() {
		System.out.println("[로그 - LogAdvice] 비즈니스 로직 수행 전 동작");
	}
}
