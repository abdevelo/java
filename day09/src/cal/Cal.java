package cal;

public class Cal {
	public static double div(int a, int b) throws Exception {
		double result = 0.0;
		try {
		result = a / b;
		}catch (Exception e) {
//			System.out.println("잘못 입력 하셨습니다."); : atm기 안쪽에서 출력임(의미x)
			throw e ; // 따라서 이렇게 CALUI 로 토스 
		}
		return result;
		
	}public static double div(double a, double b) throws InfinityException {
		double result = 0.0;
		
		if (b == 0.0) {
			throw new InfinityException("B0001");
		}
		
		result = a / b;
		return result;
	}
	
}
