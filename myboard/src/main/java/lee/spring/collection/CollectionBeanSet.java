package lee.spring.collection;

import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// Set 타입 매핑 실습
public class CollectionBeanSet {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContextSet.xml");
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		Set<String> addressSet = bean.getAddressSet();
		for(String key : addressSet) {
			System.out.println(key);
		}
		factory.close();
	}
}
