package array;

public class P103 {

	public static void main(String[] args) {
		
		//int [] arr = new int [3]; 도 똑같이 가능
//		int arr [] = new int [3]; 
//		arr [0] = 10;
//		arr [1] = 20;
//		arr [2] = 30;
		int arr[] = {10,20,30} ; // 책에서만 쓸 거임.
		
		System.out.println(arr);

		for (int data:arr) {
			System.out.printf("%d \t", data);
		}
	}

}
