package lee.spring.guestbook.vo;

import java.util.Date;

// JdbcTemplate 클래스 활용 실습
// VO에 해당하는 GuestMessage 클래스 작성
public class GuestMessage {
	private Integer id;
	private String guestName;
	private String message;
	private Date registryDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getRegistryDate() {
		return registryDate;
	}
	public void setRegistryDate(Date registryDate) {
		this.registryDate = registryDate;
	}
}
