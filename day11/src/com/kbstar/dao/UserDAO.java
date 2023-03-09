package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {

	
	HashMap<String, UserDTO> db = null;
	public UserDAO() {
		db = new HashMap<>();
	}
	
	@Override
	public void insert(UserDTO v) throws Exception {

		if (db.containsKey(v.getId())){
			throw new Exception("DB ERROR");
		}db.put(v.getId(), v);
		
	}

	@Override
	public void delete(String k) throws Exception {

		if (!db.containsKey(k)){
			throw new Exception("");
		}db.remove(k);
		
		
	}

	@Override
	public void update(UserDTO v) throws Exception {

		if (!db.containsKey(v.getId())){
			throw new Exception("");
		}db.put(v.getId(), v);
		
	}

	@Override
	public UserDTO select(String k) throws Exception {	
		UserDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<UserDTO> select() throws Exception {

		// List 로 객체 생성할 수 없음. 왜냐면 List는 인터페이스일 뿐.
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col = db.values();
		//db에있는 값을 전부 가져오자 : db.values()
		//Collection의 틀로...UserDTO의 형태로.. col이라는 이름으로
		
		for( UserDTO obj : col) {
			list.add(obj) ;
		}
		return list;
	}
	

}
