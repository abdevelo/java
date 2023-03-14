package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class CustUpdateTest {

	public static void main(String[] args) throws Exception {
		CRUDService<String, Item> crudService =
				new ItemCRUDServiceImpl();
	
	
		Item cust = new Item("pwd20","tom" , 30, "id09");
		
		
		try {
			crudService.modify(cust);
			System.out.println("수정성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
