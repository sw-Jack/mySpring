package lee.spring.web.common.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {
	@Pointcut("execution(* lee.spring.web..*Impl.*(..))")
	public void allPointCut() {}
	
	@After("allPointCut()")
	public void afterLog() {
		System.out.println("[로그] 예외 발생 유무와 관게없이 비즈니스 로직 수행 후 동작");
	}
}
