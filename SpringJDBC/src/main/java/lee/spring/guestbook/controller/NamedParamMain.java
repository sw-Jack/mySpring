package lee.spring.guestbook.controller;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lee.spring.guestbook.dao.NamedParamGuestMessageDAO;
import lee.spring.guestbook.vo.GuestMessage;

public class NamedParamMain {
	private GuestMessage makeGuestMessage(String guestName, String message) {
		GuestMessage msg = new GuestMessage();
		msg.setGuestName(guestName);
		msg.setMessage(message);
		msg.setRegistryDate(new Date());
		return msg;
	}

	public static void main(String[] args) {
		String[] configLocations = new String[] { "applicationContext.xml" };
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		NamedParamGuestMessageDAO dao = (NamedParamGuestMessageDAO) context.getBean("namedParamGuestMessageDAO");
		NamedParamMain myTest = new NamedParamMain();
		dao.insert(myTest.makeGuestMessage("손흥민", "반갑습니다"));
		dao.insert(myTest.makeGuestMessage("javaline", "Hi, Hello"));
		dao.insert(myTest.makeGuestMessage("Spring", "안녕하세요^^"));
		int count = dao.count();
		System.out.println("전체글수 : " + count);
		List<GuestMessage> list = dao.select(1, count);
		for (GuestMessage msg : list) {
			System.out.println(msg.getId() + " : " + msg.getGuestName() + " : " + msg.getMessage() + " : " + msg.getRegistryDate());
		}
		context.close();
	}

}
