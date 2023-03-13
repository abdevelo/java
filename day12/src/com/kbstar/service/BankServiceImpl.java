package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * 
 * @author SAMSUNG
 *
 */

public class BankServiceImpl implements BankService
<UserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String,UserDTO> userDao;
	DAO<String,AccountDTO>accountDao;
	DAO<String,TransactionDTO>transactionDao;
	Notification notification;
	
	public BankServiceImpl() {
		userDao = new UserDAO();
		accountDao = new AccountDAO();
		transactionDao = new TransactionDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		}catch(Exception e) {
			throw new Exception("등록 오류");
		}
		
		notification.sendEmail(v.getEmail(), "가입을 축하합니다.");
		notification.sendSMS(v.getContact(), "가입을 축하합니다.");
	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		// how ? 
		// 사용자가화면에서 id,pwd 를 입력한다
		// db에 있는 id,pwd와 비교( id 유무 여부 확인 -> pwd 확인 -> 맞으면 성공/틀리면 실패)
		// 성공을 하면 UserDTO 정보를 던져주고, 실패하면 Exception 던져주기 
		UserDTO user = null;
		user = userDao.select(k);
		if ( user != null) {
			if ( user.getPwd().equals(p) ) {
				System.out.println("OK");
			}else {
				throw new Exception("로그인 실패...");
			}
		}else {
			throw new Exception("로그인 실패...");
		}
		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		
		user = userDao.select(k);
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo = MakeAccountNumber.makeAccNum();
		AccountDTO account = 
				new AccountDTO(accNo, balance, k);
		//계좌번호, 잔액, id (이름이 아닌 이유는 unique한 값이기 때문)
		
		accountDao.insert(account);
		UserDTO user = userDao.select(k);
		notification.sendSMS(user.getEmail(), accNo+" 계좌를 생성했습니다.");
		notification.sendEmail(user.getContact(), accNo+" 계좌를 생성했습니다.");
		
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		return accountDao.search(k);
	}

	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		return transactionDao.search(acc);
		
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		System.out.println("금결원 전송...");
		// 계좌 정보 수정
		// 계좌 잔액 정보를 조회하고 잔액에서 이체하는 금액을 차감한 금액으로 수정
		AccountDTO acc = null; // 계좌 정보를 가져온다
		acc = accountDao.select(sendAcc);
		
		double abalance = acc.getBalance()-balance;
		acc.setBalance(abalance);
		
		accountDao.update(acc);
		// 거래 내역 추가
		//---------------------------------------------------//
		
		TransactionDTO tr = 
		new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "O", desc); //여기서 balance는 출금한금액
		transactionDao.insert(tr);
		
		// SMS,Email전송
		String uid = acc.getHolder(); // accountDao에서 hodler라는 id를 가져오고
		UserDTO u = userDao.select(uid); // userDao에서 holder 가있는 DTO 를 u라고 지정하고, 
		
		notification.sendEmail(u.getEmail(), sendAcc + " 에서 " + balance + "출금 되었습니다." );
		notification.sendSMS(u.getContact(), sendAcc + " 에서 " + balance + "출금 되었습니다." );
		
		// 완료 

		
	}

	
	
	
	
	
}
