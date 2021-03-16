package lee.spring.member.service;

import lee.spring.member.vo.MemberVO;
import lee.spring.member.vo.UpdateInfo;

// 회원관리 서비스를 제공할 MemberService 인터페이스 
public interface MemberService {
	void regist(MemberVO member);
	boolean update(String memberId, UpdateInfo info);
}
