package lee.spring.polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		super();
		System.out.println("===> AppleSpeaker 객체 생성");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker---소리 들린다");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker---소리 내린다");
	}
}
