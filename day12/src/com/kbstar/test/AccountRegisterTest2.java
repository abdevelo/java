package com.kbstar.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountService;

public class AccountRegisterTest2 {

	public static void main(String[] args) {

		CRUDService<String, AccountDTO> service = new AccountService();
		
		AccountDTO obj = 
		new AccountDTO("5342", 1000 ,"dongtan");
		AccountDTO obj2 = 
		new AccountDTO("6422", 2000 ,"hyangnam");
		AccountDTO obj3 = 
		new AccountDTO("3012", 3000 ,"chuncheon");
	
		
		
		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);
			System.out.println("...계좌 등록을 완료하였습니다.");
		} catch (Exception e) {
			System.out.println("계좌 개설에 실패하였습니다.");
		}
	
		try {
			System.out.println("...전체 계좌를 불러오고 있습니다.");
			Collection<AccountDTO> all = service.get();
			System.out.println(all);
			
		} catch (Exception e) {
			System.out.println("전체 계좌 불러오기에 실패하였습니다");
		}
		
		AccountDTO account = new AccountDTO();
		
		try {
			System.out.println("...계좌를 불러오고 있습니다.");
			account = service.get("5342");
			System.out.println(account);
		} catch (Exception e1) {
			System.out.println("계좌 불러오기에 실패하였습니다.");
		}
		
		
		try {
			service.remove("5342");
			System.out.println("...계좌를 해지했습니다.");
		} catch (Exception e) {
			System.out.println("계좌 해지에 실패하였습니다");
		}
		
	
		try {
			System.out.println("...전체 계좌를 불러오고 있습니다.");
			Collection<AccountDTO> all = service.get();
			System.out.println(all);
			
		} catch (Exception e) {
			System.out.println("전체 계좌 불러오기에 실패하였습니다");
		}
		
		
		try {
			obj = new AccountDTO("5342", 2000 ,"seoul");
			service.modify(obj);			
			System.out.println("정보 변경에 성공했습니다");
		} catch (Exception e) {
			System.out.println("정보 변경에 실패하였습니다");
		}
		
		
		try {
			System.out.println("...전체 계좌를 불러오고 있습니다.");
			Collection<AccountDTO> all = service.get();
			System.out.println(all);
			
		} catch (Exception e) {
			System.out.println("전체 계좌 불러오기에 실패하였습니다");
		}
		
		
	}
	

}
