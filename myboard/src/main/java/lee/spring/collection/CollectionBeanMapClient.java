package lee.spring.collection;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// Map 타입 매핑 실습
public class CollectionBeanMapClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContextMap.xml");
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		Map<String, String> addressMap = bean.getAddressMap();
		for(String key : addressMap.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, addressMap.get(key)));
		}
		factory.close();
	}
}
