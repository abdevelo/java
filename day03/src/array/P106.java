package array;

import java.util.Arrays;
import java.util.Random;

public class P106 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		Random r = new Random();
		
		for(int i=0; i<arr.length ; i++) {
//			int data = r.nextInt(99)+1; // 0~99까지의 값
//			arr[i] = data;
			arr [i] = r.nextInt(99)+1; // 위 두 줄을 한 줄로 쓰면 이 것 
		}
		
//		System.out.println(Arrays.toString(arr)); // 배열 정보 확인하고 싶을 때 간단하게 
		for (int a:arr) {
			System.out.printf("%d \t", a);
		}
		
		//Q. 배열에 각 값이 홀수인 값들의 합과 평균을 구하시오 
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		for (int odd:arr) {
			if ( odd%2 != 0) { // 배열의 몇 번째 값을 사용하는게 아니고 그 속의 값은 다 사용이니 이렇게 써도
				sum += odd ;
				cnt++;
			}
		}
		avg = sum*(1.0) / cnt ;		
		System.out.printf("\n 합 : %d \t, 평균 : %f", sum, avg);
	}
}
