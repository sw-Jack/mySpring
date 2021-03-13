package lee.spring.collection;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
                  
// List 타입 매핑 실습
public class CollectionBeanListClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContextList.xml");
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		List<String> addressList = bean.getAddressList();
		for(String address : addressList) {
			System.out.println(address.toString());
		}
		factory.close();
	}
}
