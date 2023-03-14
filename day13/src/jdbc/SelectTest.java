package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

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
		String selectSql = "SELECT * FROM cust WHERE id = '?'"; // 해당하는 id값을 삭제해달라는 요청질의 
		
		
		// Statement 생성 - SQL  
		// SQL 전송
		
 		try ( Connection con = DriverManager.getConnection(url, id, pwd);
 				PreparedStatement pstmt = con.prepareStatement(selectSql);) {
			 	pstmt.setString(1, "id29");
			try(ResultSet rset = pstmt.executeQuery() ){ // rset -> [id, pwd,name,age] 
				rset.next(); // 커서를 실제 데이터가 있는 다음 줄로 옮겼다. 
				//String db_id = rset.getString(1); // 배열이 0번째부터 시작하는 것과 달리 이건 1번째부터 시작.
				String db_id = rset.getString("id");
				String db_pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt(4);
				System.out.println(db_id+" "+name+" "+ age); 
				
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		} catch (SQLException e1) {
		}

		}		
		// 결과 받기 
		
		// Close
	
}
