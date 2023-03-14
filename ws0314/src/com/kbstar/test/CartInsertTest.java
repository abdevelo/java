package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartInsertTest {

	public static void main(String[] args) throws Exception {
		CRUDService<String, Cart> crudService =
				new CartCRUDServiceImpl();	
		Cart obj = new Cart("id02", "202020", 20);
		
		try {
			crudService.register(obj);
			System.out.println("성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
