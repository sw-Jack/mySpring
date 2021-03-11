package lee.spring.polymorphism;

// 디자인 패턴 활용 : 팩토리 패턴 
public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equals("samsung"))
			return new SamsungTV();
		else if(beanName.equals("lg"))
			return new SamsungTV();
		else 
			return null;
	}
}
