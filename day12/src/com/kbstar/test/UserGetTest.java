package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserGetTest {

	public static void main(String[] args) {

		CRUDService<String, UserDTO> service = new UserService();
		
		UserDTO obj = 
		new UserDTO("id01","pwd01","james","a@naver.com","010-9999-0234");
		UserDTO obj2 = 
		new UserDTO("id02","pwd02","james","a@naver.com","010-9999-0234");
		UserDTO obj3 = 
		new UserDTO("id03","pwd03","james","a@naver.com","010-9999-0234");

		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);
			System.out.println("---------------register Test------------------");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		UserDTO user = new UserDTO();
		try {
			user = service.get("id01");
			System.out.println(user);
			System.out.println("---------------get Test-------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		List<UserDTO> list = null; 
		
		try {
			list = service.get();
			for ( UserDTO u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
			System.out.println("--------------remove Test----------------");
			service.remove("id05");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
