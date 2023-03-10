package com.kbstar.frame;

import java.util.List;

public interface DAO <K,V>{
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public List<V> select() throws Exception;
	public List<V> search(Object obj) throws Exception; // 계좌번호를 넣으면 계좌번호 DTO, id를 넣으면 사용자dto가 출력되는 함수 생성하려고 함 
	
}
