package lee.spring.common;

import org.aspectj.lang.ProceedingJoinPoint;

// 공통 기능을 제공할 Advice 클래스
public class ProfilingAdvice {
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " 시작");
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed(); // 핵심 로직(기능) 실행
			return result; // 실행한 로직(결과)을 객체로 리턴
		} finally {
			long finish = System.currentTimeMillis();
			System.out.println(signatureString + " 종료");
			System.out.println(signatureString + " 실행 시간 : " + (finish - start) + "ms");
		} 
	}
}
