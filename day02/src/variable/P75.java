package variable;


public class P75 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.printf("%d, %d\n",a,b);
		a++; 
		++b;
		System.out.printf("%d, %d\n",a,b);
		
		int result = ++a + b++ ; 
		/* 위 더하기 식에서 result를 계산할 때 
		 * a는 1을 증가시키고 식에 포함되고
		 * b는 식을 완료하고 1을 증가시킨다 
		 * a와b의 증감식을 a+1 보다 a++ 로 사용할 때 
		 * 퍼포먼스에서 효율이 증가한다 */
		
		System.out.println(result);
		
		
		int aa = 10;
		int bb = 10;
		System.out.println( (aa++ >= 0) || (bb++ >= 0)); 
		/* 가운데 or 표현 |은 두 식중 앞의 것이 true면 뒤의 것은 확인하지 않고 넘어감
		 * ||은 두 식다 확인 후 넘어감
		 * 따라서 ||인 경우는 a++, b++ 값이 모두 1씩 증가되어 인쇄
		 * 반대로 |인 경우는 a++, b++ 값이 a만 1증가된 것으로 인쇄
		 * 안쪽 괄호는 있어도 없어도 무관하나 하는 것을 추천! */ 
		System.out.printf( "%d , %d\n",aa,bb); 
	}
}
