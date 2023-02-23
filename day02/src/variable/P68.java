package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		String s2 = "11";
		String s1 = "10";
		int s2 = Integer.parseInt(s1) ;
		int a = 10;
		System.out.println(s2+10);
		// 문자열 + 정수형 = 둘 다 문자열로 흡수
		
		int n1 = 10;
		String n2 = n1+"";
//		// int 를 String 으로 바꾸는 가장 간단한 방법
//		String n2 = String.valueOf(n1);

		
		Random r = new Random();
		int rndNum = r.nextInt(45)+1;
		System.out.println(rndNum);
	}
}
