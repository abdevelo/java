package array;

import java.util.Random;

public class P104 {

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
		
		//Q. 배열의 합과 평균을 구하시오. 
		int sum = 0;
		double avg = 0.0;
		for (int i=0; i<arr.length; i++) { //배열의 0번째~ 9번째까지 10개의 수
			sum += arr[i];
		}
//		for ( int a:arr) { //이렇게 확장 for문도 할 수 있음.
//			sum += a;
//		}
		avg = sum*(1.0)/arr.length;
		System.out.printf("\n 합: %d \t, 평균 : %f ", sum, avg);
	}

}
