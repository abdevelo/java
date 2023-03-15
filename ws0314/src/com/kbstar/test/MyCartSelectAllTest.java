package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.ShopService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.ShopServiceImpl;

public class MyCartSelectAllTest {

	public static void main(String[] args) throws Exception {
		CRUDService<String, Cart> crudService =
				new CartCRUDServiceImpl();
		
		ShopService<Cust, Cart> service =
				new ShopServiceImpl();
	
		List<Cart> list = null;
		Cart cart = null;
		try {
			list = service.myCart("id01");
			if(list.size() == 0 ) {
				System.out.println("데이터가 없습니다.");
			}else {
				for (Cart obj : list) {
					System.out.println(obj);				
				}	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
