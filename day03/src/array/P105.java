package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Random r = new Random();
		
		for(int i=0; i<arr.length ; i++) {
			arr [i] = r.nextInt(9)+1; 
		}
		
		System.out.println(Arrays.toString(arr)); // 배열 정보 확인하고 싶을 때 간단하게 
//		for (int a:arr) {
//			System.out.printf("%d \t", a);
//		}
		
		//Q. 배열의 홀수번째 요소의 합과 평균을 구하시오. 
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		for ( int i=0; i<arr.length; i++) {
			if ( i%2 != 0) { // i는 0번째부터 시작했기 때문에 짝수찾는 식이 이렇게 됨 
				continue;
			}
			sum += arr[i];
			cnt++;
		}
		avg = sum*(1.0) / cnt;
		System.out.printf("\n 합 : %d \t, 평균 : %f", sum, avg);
	}
	
}
