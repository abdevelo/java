package array;

public class P102 {

	public static void main(String[] args) {
		int a = 100; // primitive type
		
		int arr [] = new int [3]; // reference type
		arr [0] = 10;
		arr [1] = 20;
		arr [2] = 30;
		System.out.println(arr);

		for(int i=0; i<arr.length ; i++) {
			System.out.printf("%d \t", arr[i]);
		}
		System.out.println("\n Type 2 ");
		for (int data:arr) { // 확장 for문 개발잘들은 기존for문이 구닥다리라 이러한 방법을 개발, 자주사용할 것임.
			System.out.printf("%d \t", data);
		}
	}

}
