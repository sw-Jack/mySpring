package lee.spring.web.common.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

//Around Advice 클래스
@Service
@Aspect
public class AroundAdvice {
	@Pointcut("execution(* lee.spring.web..*Impl.*(..))")
	public void allPointCut() {}
	
	@Around("allPointCut()")
	public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
		String method = joinPoint.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object returnObj = joinPoint.proceed(); // 핵심 로직 수행
		stopWatch.stop();
		System.out.println(method + "() 메서드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
		return returnObj;
	}
}
