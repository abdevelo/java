package com.kbstar.app;

import com.kbstar.dao.AccountMariaDBDAO;
import com.kbstar.dao.AcoountOracleDAO;
import com.kbstar.dao.UserMariaDBDAO;
import com.kbstar.dao.UserOracleDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App {

	public static void main(String[] args) {
//		DAO dao = new UserOracleDAO();
//		UserDTO user = new UserDTO("id01", "pwd01", "james");
//		dao.insert(user);
		
		DAO dao = new AccountMariaDBDAO() {
		};
		AccountDTO account = new AccountDTO("100", "자유저축", 1000);
		dao.insert(account);
		
		}
}