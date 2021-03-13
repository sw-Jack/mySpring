 package lee.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

// Collection 타입별 매핑 실습
public class CollectionBean {
	private List<String> addressList;
	private Map<String, String> addressMap;
	private Properties addressProp;
	private Set<String> addressSet;
	
	public Set<String> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}

	public Properties getAddressProp() {
		return addressProp;
	}

	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	public Map<String, String> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
}
