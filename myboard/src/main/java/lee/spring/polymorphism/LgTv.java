package lee.spring.polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTv implements TV {
	@Autowired
	private Speaker speaker;
	
	public LgTv() {
		System.out.println("Lg TV 객체 생성");
	}

	public void powerOn() {
		System.out.println("LgTV 전원을 켠다.");		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV 전원을 끈다.");		
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
