package lee.spring.collection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// Properties 타입 매핑 실습
public class CollectionBeanPropClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContextProp.xml");
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		Properties addressProp = bean.getAddressProp();
		for(String key : addressProp.stringPropertyNames()) {
			System.out.println(String.format("키  : %s, 값 : %s", key, addressProp.get(key)));
		}
		factory.close();
	}
}
