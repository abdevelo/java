package variable;

import java.util.Scanner;

public class P73 {

	public static void main(String[] args) {
		int a = 10 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("명령어를 입력 하시요(q,i,d,s)");
		String cmd = sc.next(); // cmd에 다음 화면에 입력한 값을 넣으시오.
		System.out.printf("%s를 입력 했습니다.", cmd);
		sc.close(); 
		// application이 next를 통해 입력값을 저장하는 pipe를 열어둔 후에는 꼭 이를 닫아주어야 함.
	}
}
