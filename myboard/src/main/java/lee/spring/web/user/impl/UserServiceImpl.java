package lee.spring.web.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lee.spring.web.user.UserService;
import lee.spring.web.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}
