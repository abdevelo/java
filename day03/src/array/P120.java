package array;

public class P120 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		// 배열의 합과 평균
		int sum = 0;
		double avg = 0.0;
		
		for (int i : a) {
			sum += i;
		}
		avg = sum*(1.0)/a.length; //4칙연산원칙에 의해서 sum*1.0이 먼저되고 있다는 사실을 잊지 말기
		
		System.out.printf("합 : %d\t, 평균 : %f",sum,avg);

	}

}
