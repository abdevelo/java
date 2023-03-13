package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertTest3 {

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
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)"; // 쌍 따옴표 안의 내용을 Oracle창에 입력하는 셈...?

	
		// Statement 생성 - SQL  
		// SQL 전송
		
 		try ( Connection con = DriverManager.getConnection(url, id, pwd);
 				PreparedStatement pstmt = con.prepareStatement(insertSql);) {
			 pstmt.setString(1, "id01");
			 pstmt.setString(2, "pwd10");
			 pstmt.setString(3, "홍길동");
			 pstmt.setInt(4, 50);
			 int result = pstmt.executeUpdate(); // 위에서 만든 커리문을 날린다. 실행이 잘 되면 1을 보여줌.
			 System.out.println(result);
			 
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		}		
		// 결과 받기 
		
		// Close
	
}
