package com.kbstar.test;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserRegisterTest2 {

	public static void main(String[] args) {
		
		CRUDService<String, UserDTO> service = new UserService();
		
		UserDTO obj = 
		new UserDTO("id01","pwd01","james","a@naver.com","010-9999-0234");

		UserDTO obj2 = 
				new UserDTO("id01","pwd01","james","a@naver.com","010-9999-0234");

		try {
			service.register(obj);
			System.out.println("----------------------------------");
			service.register(obj2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
