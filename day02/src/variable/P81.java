package variable;

import java.util.Scanner;

public class P81 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number..");
		int num = Integer.parseInt(sc.next());
		
		String result = (num>0) ? "정상" : "비정상" ; // 삼항연산자 : 퍼포먼스는 큰 차이 없어도 훨씬 간단함!
		
		System.out.println(result);
		sc.close();

	}
	
}
