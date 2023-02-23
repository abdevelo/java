package variable;

public class P79 {

	public static void main(String[] args) {
		
		
		int credit = 900; // int a ;; 만 선언하면 안되고 local variable을 초기화 =0; 하고 써야함
	
		
		String grade = ""; // string 을 초괴화시키는 법
		if(credit >= 800 ) {
			grade = "High";
		}else {
			grade = "Low";
		
		}
		System.out.println(grade);
	}
}
