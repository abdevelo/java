package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartDeleteTest {

	public static void main(String[] args) throws Exception {
		CRUDService<String, Cart> crudService =
				new CartCRUDServiceImpl();
	

		try {
			crudService.remove("2023314720100");
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
