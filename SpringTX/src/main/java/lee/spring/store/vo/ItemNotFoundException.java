package lee.spring.store.vo;

// 아이템을 찾지 못할 경우의 사용자 정의 예외 
public class ItemNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private Integer itemId;

	public ItemNotFoundException(Integer itemId) {
		super("not found item : id = " + itemId);
		this.itemId = itemId;
	}

	public Integer getItemId() {
		return itemId;
	}
}
