package lee.spring.common;

import org.aspectj.lang.JoinPoint;

import lee.spring.member.vo.UpdateInfo;

//파라미터 접근 실습용 
//추적 정보를 제공할 Advice 클래스
public class UpdateMemberInfoTraceAdvice {
	public void traceReturn(JoinPoint joinPoint, boolean result, String memberId, UpdateInfo info) {
		System.out.println("[TA] 정보 수정 : 결과 = " + result + ", 대상 회원 = " + memberId + ", 수정 정보 = " + info);
	}
}
