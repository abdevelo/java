
package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService  implements Service<String, UserDTO>{

	
	DAO<String, UserDTO> dao;
	
	public UserService() {
		dao = new UserDAO();
	}
		
	@Override
	public void register(UserDTO v) { 
		System.out.println("Security Check..."); //보안 체크 먼저 
		dao.insert(v); // 데이터 베이스에 먼저 입력
		System.out.println("Send Mail..."); // 그 후 메일발송
		System.out.println("Send SMS..."); // 문자발송 까지 serviceDAO에서 해줌
	}

	@Override
	public void remove(String k) { 
		dao.delete(k);
		System.out.println("Send SMS...");
	}

	@Override
	public void modify(UserDTO v) {
		dao.update(v);
		System.out.println("Send SMS...");
		
	}

}
