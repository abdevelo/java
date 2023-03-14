package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemInsertTest {

	public static void main(String[] args) throws Exception {
		CRUDService<String, Item> crudService =
				new ItemCRUDServiceImpl();
	
	
		Item obj = new Item("tester", 888888, 8.8);
		
		
		try {
			crudService.register(obj);
			System.out.println("성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
