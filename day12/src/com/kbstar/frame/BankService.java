package com.kbstar.frame;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;

/** 슬래시 땡땡 엔터 하면 이렇게 나옴
 * 23.3.10
 * @author smpark / a department A .Inc / 010-0000-0000
 *
 * @param <V1> UserDTO
 * @param <V2> AccountDTO
 * @param <V3> TransactionDTO
 * @param <K> String id
 * @param <P> String pwd
 * 
 * 구현하려는 BankService는 사용자가 직접 인터넷으로 이용하는 기능임
 * 
 */

public interface BankService<V1, V2, V3 , K, P> {
	
	public void register (V1 v) throws Exception ;
	public V1 login (K k, P p) throws Exception; //id,pwd 넣으면 로그인성공인지 return
	public V1 getUserInfo(K k) throws Exception;
	public void makeAccount (K k, double balance) throws Exception;
	// AccountDTO에가서 필드 영역을 확인 accNo, balance, holder(=id) 
	public List<V2> getAllAccount(K k) throws Exception;
	public List<V3> getAllTr(String acc) throws Exception;
	public void transaction(String sendAcc,String receiveAcc, 
							double balance,String desc) throws Exception; //이체
	
	}

