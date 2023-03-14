package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustUpdateTest {

	public static void main(String[] args) throws Exception {
		CRUDService<String, Cust> crudService =
				new CustCRUDServiceImpl();
	
	
		Cust cust = new Cust("id09", "pwd20", "tom", 30);
		try {
			crudService.modify(cust);
			System.out.println("수정성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
