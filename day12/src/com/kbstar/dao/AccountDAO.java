package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class AccountDAO implements DAO<String, AccountDTO> {

	HashMap<String, AccountDTO> db;
	
	public AccountDAO () {
		db = new HashMap<String, AccountDTO>();
	}
	
	
	@Override
	public void insert(AccountDTO v) throws Exception {
		db.put(v.getAccNo(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		db.remove(k);
	}

	@Override
	public void update(AccountDTO v) throws Exception {
		db.put(v.getAccNo(), v);

	}

	@Override
	public AccountDTO select(String k) throws Exception {
		AccountDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<AccountDTO> select() throws Exception {
		
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		Collection<AccountDTO> col = db.values();
		for ( AccountDTO u : col) {
			list.add(u);
		}
		return list;
	}

	// 사용자의 계좌 조회
	// 사용자의 : 사용자의 id;
	// Object obj = new String ();
	
	@Override
	public List<AccountDTO> search(Object obj) throws Exception {
		
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		Collection<AccountDTO> col = db.values();
		
		for( AccountDTO acc : col ) {
			// 계좌 중에서 ID( AccountDTO의 holder)가 obj와 같으 것들만 입력
			if (acc.getHolder().equals(obj)) {
				list.add(acc);				
			}
		}
		return list;
	}

	
	
	
	
	
}
