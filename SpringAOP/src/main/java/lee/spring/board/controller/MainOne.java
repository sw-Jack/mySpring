package lee.spring.board.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lee.spring.board.service.WriteArticleService;
import lee.spring.board.vo.ArticleVO;
import lee.spring.member.service.MemberService;
import lee.spring.member.vo.MemberVO;

public class MainOne {

	public static void main(String[] args) {
		String[] configLocations = new String[] { "applicationContextOne.xml" };
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(configLocations);
		WriteArticleService articleService = (WriteArticleService)context.getBean("writeArticleService");
		articleService.write(new ArticleVO());
		//위와 같은 의미이지만 다른 방식
		MemberService memberService = context.getBean("memberService", MemberService.class);
		memberService.regist(new MemberVO());
		context.close();
	}
}
