package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) throws Exception {
		CRUDService<String, Cust> crudService =
				new CustCRUDServiceImpl();
	
	
//		Cust cust = new Cust("id99", "pwd99", "dolphin", 90);
		Cust cust = new Cust("id55", "pwd88", "dolphin", 90);
//		Cust cust = new Cust("id77", "pwd88", "dolphin", 90);
		try {
			crudService.register(cust);

			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
