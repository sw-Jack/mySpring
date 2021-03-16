package lee.spring.web.common.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Service
@Aspect
public class BeforeAdvice {
	
	@Pointcut("execution(* lee.spring.web..*Impl.*(..))")
	public void allPointCut() {}
	
	@Before("allPointCut()")
	public void beforeLog(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("[사전처리] " + method + "() 메서드의 ARGS 정보 : " + args[0].toString());
	}
}
