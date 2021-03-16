package lee.spring.web.common;

import org.aspectj.lang.JoinPoint;

import lee.spring.web.board.BoardVO;

public class AfterReturningAdvice {

	public void afterReturningLog(JoinPoint joinPoint, Object returnObj) { // 첫 매개변수는 반드시 JoinPoint
		String method = joinPoint.getSignature().getName();
		if(returnObj instanceof BoardVO) {
			BoardVO board = (BoardVO) returnObj;
			if(board.getWriter().equals("손")) {
				System.out.println(board.getWriter() + "로그인");
			}
		}
		System.out.println("[사후처리] " + method + "() 메서드 리턴값 : " + returnObj.toString());
	}
}
