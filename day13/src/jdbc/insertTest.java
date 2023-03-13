package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertTest {

	public static void main(String[] args) {

		// Driver Loading
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");// ~~라는 데이터 베이스를 탑재할 건데
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return; // 예외가 나왔으면 더 이상 진행하지 마라
		} 
		System.out.println("Driver Loading 성공.");
		
		// Connect ( id address....port number....)
		
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.58:1521:XE";
		
		Connection con = null; 
		
		try {
			con = DriverManager.getConnection(url, id, pwd);
		} catch (SQLException e) {
			System.out.println("접속 실패 !!");
			e.printStackTrace();
			return;
		}
		System.out.println("접속 성공 !!");
		
		// Statement 생성 - SQL  
		// SQL 전송
		
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)"; // 쌍 따옴표 안의 내용을 Oracle창에 입력하는 셈...?
		PreparedStatement pstmt = null ; // try 구문에서 밖으로 빼준다. 문제발생할 수 있으니.
 		try {
			 pstmt = con.prepareStatement(insertSql); // 해당 sql문에 순서대로 값을 세팅 
			 pstmt.setString(1, "id28");
			 pstmt.setString(2, "pwd10");
			 pstmt.setString(3, "홍길순");
			 pstmt.setInt(4, 50);
			 int result = pstmt.executeUpdate(); // 위에서 만든 커리문을 날린다.
			 System.out.println(result);
			 pstmt.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if ( pstmt != null) {
					pstmt.close();					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		// 결과 받기 
		
		// Close
		
		try {
			if ( con!= null) {
				con.close();				
			}
		} catch (SQLException e) {
			System.out.println("close 실패 !!");
			e.printStackTrace();
		}
		System.out.println("close 성공 !!");
	}

}
