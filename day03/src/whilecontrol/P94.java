package whilecontrol;

public class P94 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오
		// 짝수만 구하시오
		// i%2 == 0;
		// 8까지만 하시오
				
		int sum = 0;
		double avg = 0.0;

		System.out.println("Start ...");
		int cnt = 0;
		for (int i=1; i <= 10; i++) {
			
			if ( i%2 == 0 ) {
			sum += i;
			cnt++;
			}
			
			if ( i == 8) {
				break;
			}
		}
		avg = (sum*1.0) / (cnt*1.0); 
		
		
		

		System.out.printf("- 합 : "+"%d\n",sum);
		System.out.printf("- 평균 : "+"%2.2f \n", avg);
		System.out.println("End ..."+"실행횟수 : "+cnt);
		
	}
}
