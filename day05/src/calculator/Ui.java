package calculator;

public class Ui {

	public static void main(String[] args) {
		Calculator cal = new Calculator(); // 함수부르고
		int result = 0; // 함수 값 받을 준비하고 
		result = cal.sum(10, 20); // 함수 값을 넘겨주고
		System.out.println(result); // 넘긴 값을 호출
		cal.save(result); //결과를 저장해라 , save함수는 return값이 없기에 받을 게 없음
		System.out.println("OK");
	}

}
