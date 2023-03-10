package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class BankTest {

	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> 
		service = new BankServiceImpl(); //엔터 친 것일 뿐
		
		//Register
		
		UserDTO user = 
				new UserDTO("id01", "pwd01", "name", "a@naver.com", "010-0000-0000");
		
		try {
			service.register(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Log in // 데이터를 아래에 입력해서 test하는 것임 
		
		String id = "id01"; //화면에서 id입력받음
		String pwd = "pwd01"; // 화면에서 pwd입력받음
		UserDTO loginUser = null; // login 후에 받을 유저 정보 
		
		try {
			loginUser = service.login(id, pwd);  // 입력받은 값을 login에 넣어줌 
			System.out.println(loginUser);			
			System.out.println("Login OK ^^! ");
		} catch (Exception e) {
			System.out.println(e.getMessage());	// 로그인 실패했다는 메세지 띄워주기 
		}
	}

}
