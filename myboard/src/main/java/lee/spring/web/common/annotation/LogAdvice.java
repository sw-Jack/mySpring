package lee.spring.web.common.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect // Aspect = Poincut + Advice // 따라서 @Aspect가 설정된 객체는 반드시 pointcut과 advice를 결합하는 설정이 있어야 함
public class LogAdvice {
	@Pointcut("execution(* lee.spring.web..*Impl.*(..))")
	public void allPointCut() {
	}
	
	@Before("allPointCut()")
	public void printLog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}
	
	@Pointcut("execution(* lee.spring.web..*Impl.get*(..))")
	public void getPointCut() {}
}
