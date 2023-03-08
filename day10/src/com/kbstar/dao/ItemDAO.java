package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{

	@Override
	public void insert(ItemDTO v) throws Exception {
		connect();
		
		if (v.getId() == 10) {
			throw new Exception ("EX0004");
		}
		System.out.println(v);
		System.out.println("Inserted ...");
	
		
	}

	//int id = 100; 가능?
	//원시형 데이터임에도 객체로 입력가능 : unboxing
	@Override
	public void delete(Integer k) {
		connect();
		System.out.println(k);
		System.out.println("Deleted ...");
		close();
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v);
		System.out.println("Updated ...");
		
	}

}
