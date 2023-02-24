
// 1~100까지의 숫자 중
// (1) 3의 배수의 합과 평균을 구하시오
// (2) 4의 배수의 합과 평균을 구하시오
// (3) 7의 배수의 합과 평균을 구하시오 

package ifcontrole;

public class Ws {
	public static void main(String[] args) {

		int i = 1;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		double avg1 = 0.0;
		double avg2 = 0.0;
		double avg3 = 0.0;

		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum1 += i;
				cnt1++;
			}
			if (i % 4 == 0) {
				sum2 += i;
				cnt2++;
			}
			if (i % 7 == 0) {
				sum3 += i;
				cnt3++;
			}
		}

		avg1 = (sum1 * 1.0) / cnt1;
		avg2 = (sum2 * 1.0) / cnt2;
		avg3 = (sum3 * 1.0) / cnt3;

		System.out.printf("%d, %f \n", sum1, avg1);
		System.out.printf("%d, %f \n", sum2, avg2);
		System.out.printf("%d, %f \n", sum3, avg3);
	}
}
