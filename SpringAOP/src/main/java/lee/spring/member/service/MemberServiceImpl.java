package lee.spring.member.service;

import lee.spring.member.vo.MemberVO;
import lee.spring.member.vo.UpdateInfo;

public class MemberServiceImpl implements MemberService {

	// context Bean 등록을 위해 default 생성자 반드시 필요
	public MemberServiceImpl() {} 
	
	@Override
	public void regist(MemberVO member) {
		System.out.println("---> MemberServiceImpl.regist() 메서드 실행");
	}

	@Override
	public boolean update(String memberId, UpdateInfo info) {
		System.out.println("---> MemberServiceImpl.update() 메서드 실행");
		return true; // 회원 정보 수정 성공 상태값
	}
}
