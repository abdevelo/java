package whilecontrol;

public class P93 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오 


		System.out.println("Start ...");
		int cnt = 0;
		int sum = 0;
		double avg = 0.00;
		for (int i=1; i <= 100; i++) {
			
			sum += i;
			cnt++;
		}
		
		avg = (sum*1.0) / (cnt*1.0); // 그래도 나는 50.00나옴

		System.out.printf("%d, %2.2f \n",sum , avg);
		System.out.println("End ..."+cnt);
		
	}
}
