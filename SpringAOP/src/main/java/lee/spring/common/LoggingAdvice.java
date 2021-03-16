package lee.spring.common;

// Before, After-returnig, After-throwing, After Advice 실습용
// Logging 서비스를 제공할 Advice 클래스
public class LoggingAdvice {
	public void before() {
		System.out.println("[LA] 메서드 실행 전 전처리 수행");
	}
	
	public void afterReturning(Object returnObj) {
		System.out.println("[LA] 메서드 실행 후 후처리 수행, 리턴값 : " + returnObj);	
	}
	
	public void afterThrowing(Throwable e) {
		System.out.println("[LA] 메서드 실행 후 후처리 수행, 리턴값 : " + e.getClass().getName());	
	}
	
	public void after() {
		System.out.println("[LA] 메서드 실행 완료");
	}
}
