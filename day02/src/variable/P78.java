package variable;

public class P78 {

	public static void main(String[] args) {
		int a = 10; // a = 10
		a = --a + 1; // a = (10-1) + 1 
		System.out.println(a); // 10
		
		/* --a 가 a-1 보다 효율적으로 jvm과 자바에서 작동한다
		 * */
		
	}
}
