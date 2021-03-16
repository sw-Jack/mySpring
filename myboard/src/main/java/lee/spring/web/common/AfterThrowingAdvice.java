package lee.spring.web.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	
	public void afterThrowingLog(JoinPoint joinPoint, Exception e) {
		String method = joinPoint.getSignature().getName();
		System.out.println("[예외처리] " + method + "() 메서드 수행 중 발생된 예외 메세지 : " + e.getMessage());
	}
}
