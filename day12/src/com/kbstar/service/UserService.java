package com.kbstar.service;

import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class UserService implements CRUDService<String, UserDTO> {
	//Serivce의 메소드들은 화면과 관련이 있다.
	
	DAO<String, UserDTO> userDao;
	Notification notification;

	public UserService() {
		userDao = new UserDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		// 비밀번호 암호화
		try {
			userDao.insert(v);	
		}catch(Exception e){
			throw new Exception("회원가입이 실패 하였습니다. (EX0001)");
		}
		notification.sendEmail(v.getEmail(), Msg.registerMsg1);
		notification.sendSMS(v.getContact(), Msg.registerMsg2);
	}

	@Override
	public void remove(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		
		try {
			userDao.delete(k);
		}catch (Exception e) {
			throw new Exception("탈퇴 오류 입니다.");
		}
		notification.sendSMS(user.getContact(), Msg.removeMsg1);
		notification.sendEmail(user.getEmail(), Msg.removeMsg2);
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		
		try {
			userDao.update(v);	
		}catch(Exception e) {
			throw new Exception("수정 오류 입니다.");
		}
		
	}

	@Override
	public UserDTO get(String k) throws Exception {
		UserDTO obj = null; 
		obj = userDao.select(k);
		return obj;
	}

	@Override
	public List<UserDTO> get() throws Exception {

		// List<UserDTO> list = userDao.select(); 
		// 로 한 줄이 아니라 두 줄로 작성해주는 이유는
		// try~catch 로 예외 구문을 작성해주기 위해서이다 
		// UserDTO 에서는 ArrayList 로 담아야하지만 여기서는 List로 담을 수 있느 이뉴는
		// UserDTO에서 ArrayList를 통해 불러와서 List형태로 담았다
		// 이게 가능한 이유는 이런식으로 하위클래스가 상위클래스로 자동으로 casting될 수 있기 때문이다. 
		// List list = new ArrayList () ;
		
		
		List<UserDTO> list = null;
		
		try {
			list = userDao.select();
		}catch(Exception e) {
			throw new Exception("조회 오류");
		}
		return list;
		
	}

}
