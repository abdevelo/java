package whilecontrol;

public class P96 {

	public static void main(String[] args) {
		int i = 1;
		int cnt = 0;
		int sum = 0;
		double avg = 0.0;
		
		System.out.println("Start ...");
	
		while (i <= 10) {
			if ( i%2 ==0) {
				sum += i ;		
				cnt++;
			}
			
			if ( i == 8) {
				break;
			}
			
			i++; // i ++ 증감식이 if~break문보다 위에 있으면 값이 달라짐. 논리에 따라 유의하시오.
		}
		avg = (sum*1.0) / cnt ;

		System.out.printf("%d , %f \n", sum, avg);
		System.out.println("End ..."+cnt);
	}
}
