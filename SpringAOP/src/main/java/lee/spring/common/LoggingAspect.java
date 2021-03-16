package lee.spring.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class LoggingAspect {
	// 포인트컷 클래스를 따로 생성, 같은 패키지 내에 생성했으므로 [패키지.메서드]
	@Before("PublicPointcut.publicMethod()")
	public void before() {
		System.out.println("[LA] 메서드 실행 전 전처리 수행");
	}

	@AfterReturning(pointcut = "PublicPointcut.publicMethod()", returning = "returnObj")
	public void afterReturning(Object returnObj) {
		System.out.println("[LA] 메서드 실행 후 후처리 수행, 리턴값=" + returnObj);
	}

	@AfterThrowing(pointcut = "PublicPointcut.publicMethod()", throwing = "e")
	public void afterThrowing(Throwable e) {
		System.out.println("[LA] 메서드 실행 중 예외 발생, 예외=" + e.getClass().getName());
	}

	@After("PublicPointcut.publicMethod()")
	public void afterFinally() {
		System.out.println("[LA] 메서드 실행 완료");
	}

}
