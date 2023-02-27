package array;

import java.util.Arrays;
import java.util.Random;

public class P114 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(9) + 1;
			}
		}
//		System.out.println(Arrays.toString(arr)); // 주소값만 출력

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		
		for (int []i : arr) { //int i 를 그대로하면 안됨. 정수를 매번 가져오는 게 아니라 배열을 가져오기에.
			for (int j : i) {
				System.out.printf("%d\t", j);
			}
			System.out.println("");
		}
	}
}
