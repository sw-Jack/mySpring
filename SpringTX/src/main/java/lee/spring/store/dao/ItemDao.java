package lee.spring.store.dao;

import lee.spring.store.vo.Item;

// 아이템을 검색해 줄 인터페이스
public interface ItemDao {
	Item findById(Integer itemId);
}
