package lee.spring.web.common;

public class AfterAdvice {
	
	public void afterLog() {
		System.out.println("[로그] 예외 발생 유무와 관게없이 비즈니스 로직 수행 후 동작");
	}
}
