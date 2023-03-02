package board;

public class DAO {
	public void insert(String str) {
		System.out.println("Insert Oracle Database Row "+str);
	}
	// 해당 글 번호를 입력하고 그 글의 내용을 ~~게 업데이트
	public void update(int num, String str) { 
		System.out.println("Insert Oracle Database Row"+num+" "+str);		
	}
	public void delete(int num) {
		System.out.println("Deleted Oracle Database Row"+num);		
	}
	public String select(int num) {
		return "Hi Database ...";
	}

}
