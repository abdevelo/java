package variable;


public class P54 {

	public static void main(String[] args) {
		// boolean
		boolean b1 = 10 > 5;

		// 정수
		// default는 int이기에 숫자가 입력될 경우 자동으로 int로 생각
		// 따라서 우측 큰 수의 자료형을 long 타입으로 입력하고 싶은 경우 숫자 맨 뒤에 L을 붙임
		
		int n1 = 10;
		long n2 = 0L;
		// 그 후에 n2 = ~~~~~ 이 사이트에 한달동안 접속한 횟수 등등의 함수코드를 짜 줌.
		
		// 실수
		// 정수와 마찬가지로 default 가 double 이라 float 입력 시에는 숫자 뒤 f붙이기
		double d1 = 1.0;
		float f1 = 1.0f;
		
		double d2 = 1/2;
		//이렇게 할 경우 우측의 정수 나누기 정수는 정수로 입력이 되어 출력값이 0.0 임
		double d3 = 10.0/3.0;
		float f2 = 10.0f/3.0f;
		
		// char
		char c1 = 'A';
		char c2 = 65;
		
		
		int n3 = 10;
		double n4 = 10.0;
		double result = n3 +n4 ;
		
		System.out.println(result);
		
		 
	}

}
