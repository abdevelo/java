package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartUpdateTest {

	public static void main(String[] args) throws Exception {
		CRUDService<String, Cart> crudService =
				new CartCRUDServiceImpl();
	
		Cart cart = new Cart("2023314862100", "id44", "4040", 3);
		try {
			crudService.modify(cart);
			System.out.println("수정성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
