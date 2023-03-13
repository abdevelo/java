package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllTest {

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
		String selectAllSql = "SELECT * FROM cust "; // 해당하는 id값을 삭제해달라는 요청질의 
		
		
		// Statement 생성 - SQL  
		// SQL 전송
		
 		try ( Connection con = DriverManager.getConnection(url, id, pwd);
 				PreparedStatement pstmt = con.prepareStatement(selectAllSql);) {

 			try(ResultSet rset = pstmt.executeQuery() ){ 
 				
 				// rset -> [ id01, pwd01, name,age]
 				//         [ id02, pwd02, name2,age]
 				//         [ id03, pwd03, nam3, age]
 				
 				while ( rset.next()) { 
 					String db_id = rset.getString("id");
 					String db_pwd = rset.getString("pwd");
 					String name = rset.getString("name");
 					int age = rset.getInt(4);
 					System.out.println(db_id+" "+name+" "+ age); 
 				}
 				
				
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		} catch (SQLException e1) {
		}

		}		
		// 결과 받기 
		
		// Close
	
}
