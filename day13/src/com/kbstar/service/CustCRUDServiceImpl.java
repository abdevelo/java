package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String, Cust> {

	DAO<String, String, Cust> dao;

	public CustCRUDServiceImpl() {
		dao = new CustDaoImpl();
	}

	@Override
	public void register(Cust v) throws Exception {
		// 관리자가 사용자를 등록해주는 기능
		// DB입력

		/**
		 * 여기서 원래 da.insert(v);로 끝나는 코드로 실행이 가능한데 테스트를 하던 중 같은 값의 id를 입력하면 violated ....
		 * 라는 에러메세지가 나온다. 이러한 오류의 경우에 메세지를 표츌하기 위해서는 이곳에서 Exception을 한번 더 잡아주어야 한다. 잡아주는
		 * 과정에서 중복등록으로 인한 오류라는 메세지를 고객이 보는 화면으로 날려줄 수 있다.
		 */

		try {
			dao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) { // 예외 오류 중 java.sql. 뒷 부분임
				throw new Exception("ID가 중복 되었습니다.");
			} else
				throw new Exception("시스템 장애 입니다..");
		}

		// Email, SMS 전송
	}

	@Override
	public void modify(Cust v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("해당ID가 존재하지 않습니다.");
			}
		}
	}

	@Override
	public void remove(String k) throws Exception {

		try {
			dao.delete(k);

		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}
		}
	}

	@Override
	public Cust get(String k) throws Exception {
		Cust cust = null;

		try {
			cust = dao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			} else {
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}

		}

		return cust;
	}

	@Override
	public List<Cust> get() throws Exception {
		List<Cust> list = null;
		try {
			list = dao.selectAll();
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템장애");
			} else {
				throw new Exception("ID가 존재하지 않습니다.");
			}
		}
		return list;
	}
}
