package oop3;

public class App {

	public static void main(String[] args) {
		Car car = new Car("C1", "red", 1000, 50);
		System.out.println(car.toString());//자동차의 정보를 string화 해서 출력 
		
		car.go(10); //10km를 달리겠다 
		car.setCfsize(30);
		car.go(10);
		System.out.println(car.toString());

	}

}
