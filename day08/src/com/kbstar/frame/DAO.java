package com.kbstar.frame;

public interface DAO <K,V> {
	
	String IP = "127.0.0.1"; 
	public void insert(V v);
	public void delete(K k);
	public void update(V v);
	
	default void connect() {
		System.out.println(IP+"에 접속 하였습니다.");
	}
	
	default void close() {
		System.out.println(IP+"에 접속을 해제 하였습니다.");
	}

}
