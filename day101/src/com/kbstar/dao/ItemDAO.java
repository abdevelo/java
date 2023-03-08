package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<String, ItemDTO>{

	HashMap<String, ItemDTO>  db =null;
	
	public ItemDAO() {
		
		db = new HashMap<String, ItemDTO>(); //이건 왜 있지?
	}

	@Override
	public void insert(ItemDTO v) throws Exception {
		if ( db.containsKey(String.valueOf(v.getId()))){
			throw new Exception();
		}
		db.put(String.valueOf(v.getId()) , v);
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if ( !db.containsKey(String.valueOf(v.getId()))){
			throw new Exception();
		}	
		db.put(String.valueOf(v.getId()), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if ( !db.containsKey(k)){
			throw new Exception();
		}
		db.remove(k);
	}

	@Override
	public ItemDTO select(String k) throws Exception {
		
		if ( !db.containsKey(k)){
			throw new Exception();
		}
		ItemDTO item = db.get(k);
		
		return item;
	}

	@Override
	public List<ItemDTO> select() throws Exception {
		
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		Collection<ItemDTO> col = db.values();
		
		for ( ItemDTO u : col ) {
			list.add(u);
		}
		return list;
	}
	

}
