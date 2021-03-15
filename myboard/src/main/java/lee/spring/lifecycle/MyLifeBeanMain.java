package lee.spring.lifecycle;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MyLifeBeanMain {

	public static void main(String[] args) {
		//FileSystemResource resource = new FileSystemResource("src/main/resources/applicationContext3.xml");
		//XmlBeanFactory factory = new XmlBeanFactory(resource);
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext3.xml");
		//factory.addBeanPostProcessor(new CustomBeanPostProcessor());
		MyLifeBean bean = (MyLifeBean)factory.getBean("myLifeBean");
		bean.sayHello();
		//factory.destroyBean("myLifeBean", bean);
		factory.close();
	}
}
