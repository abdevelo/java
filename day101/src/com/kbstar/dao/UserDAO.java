package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String , UserDTO> {

	HashMap<String,UserDTO> db = null ; // 데이터 베이스를 선언한다
	
	public UserDAO() {
		db = new HashMap<>();
	}
	
	@Override 
	public void insert(UserDTO v) throws Exception {
		//화면에서 입력한 UserDTO가 들어오면 db에 넣는다 
		if ( db.containsKey(v.getId())) { //기존에 id랑 겹칠 때
			throw new Exception();
		}
		db.put(v.getId(), v); // db에 v의아이디값으로 v데이터가 저장
		
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if (!db.containsKey(v.getId())) {
			throw new Exception();
		}	
		db.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if (!db.containsKey(k)) {
			throw new Exception();
		}	
		db.remove(k);					
	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO user = null;
		user = db.get(k); //db데이터베이스에서 k값을 찾으면 user가 튀어나온다 
		return user;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col = db.values();  //db에서 값을 꺼내고 
		//위의 list에 담을 것 
		
		for ( UserDTO u : col) {
			list.add(u);
		}
		return list;
	}

}
