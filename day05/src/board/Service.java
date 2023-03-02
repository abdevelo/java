package board;

public class Service {
	
	DAO dao; 
	
	// service클래스를 생성할 때 동시에 dao 객체도 만들어진다.
	public Service() {
		dao = new DAO();
	}
	
	
	public void register (String str) {
		//Security or Log 데이터베이스에 넣기 전에 
		dao.insert(str);
	}
	
	public void remove(int num) {
		dao.delete(num);
	}
	
	public void modify(int num, String str) {
		dao.update(num, str);
	}
	
	public String get(int num) {
		return dao.select(num); 
	}

}
