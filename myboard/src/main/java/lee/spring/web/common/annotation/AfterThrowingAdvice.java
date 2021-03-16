package lee.spring.web.common.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {
	@Pointcut("execution(* lee.spring.web..*Impl.*(..))")
	public void allPointCut() {}
	
	@AfterThrowing(pointcut = "allPointCut", throwing = "e")
	public void afterThrowingLog(JoinPoint joinPoint, Exception e) {
		String method = joinPoint.getSignature().getName();
		System.out.println("[예외처리] " + method + "() 메서드 수행 중 발생된 예외 메세지 : " + e.getMessage());
	}
}
