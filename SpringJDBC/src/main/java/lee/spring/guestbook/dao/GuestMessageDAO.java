package lee.spring.guestbook.dao;

import java.util.List;

import lee.spring.guestbook.vo.GuestMessage;

// DAO 기능을 추상화한 인터페이스
public interface GuestMessageDAO {
	public int count();
	public List<GuestMessage> select(int begin, int end);
	public int insert(GuestMessage message);
	public int delete(int id);
	public int update(GuestMessage message);
}
