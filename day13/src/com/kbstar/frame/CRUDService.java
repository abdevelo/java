package com.kbstar.frame;

public interface CRUDService<K,V> {
	public void register(V v) throws Exception;
	public void modify(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void get(K k) throws Exception;
}
