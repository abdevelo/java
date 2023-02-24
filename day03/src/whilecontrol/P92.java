package whilecontrol;

public class P92 {

	public static void main(String[] args) {
		System.out.println("Start ...");
		
		int i = 1;
		int sum = 0;
		double avg = 0.0;
		
		while (i <= 100) {
			sum += i ;		
			i++;
		}
		avg = (sum*1.0) / (i) ;

		System.out.printf("%d , %f \n", sum, avg);
		System.out.println("End ..."+i);
	}
}


//System.out.println("Start ..."); // ( 1,2,3,4,5,6,7,8,9,10) 이 화면에 출력 
//
//int i = 0;
//while (i < 10) {
//i++; 	
//System.out.println(i);
//	
//}
//System.out.println("End ...");
//}}