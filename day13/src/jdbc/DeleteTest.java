package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

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
		String deleteSql = "DELETE FROM cust WHERE id = ?"; // 해당하는 id값을 삭제해달라는 요청질의 
		
		
		// Statement 생성 - SQL  
		// SQL 전송
		
 		try ( Connection con = DriverManager.getConnection(url, id, pwd);
 				PreparedStatement pstmt = con.prepareStatement(deleteSql);) {
			 pstmt.setString(1, "id1");
			 
			 int result = pstmt.executeUpdate(); // 오류가 있는 경우 값이 0이 나온다. 
			 System.out.println(result);
			 
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		}		
		// 결과 받기 
		
		// Close
	
}
