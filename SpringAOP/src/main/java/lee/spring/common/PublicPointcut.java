package lee.spring.common;

import org.aspectj.lang.annotation.Pointcut;

//@Aspect 어노테이션을 활용하여 다양한 Advice 적용하기
//Pointcut 클래스 따로 생성
public class PublicPointcut {
	@Pointcut("execution(public * lee.spring..*(..))")
	public void publicMethod() {}
}
