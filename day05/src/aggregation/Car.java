package aggregation;

public class Car {
	// attribute 속성
	public String name ;
	public String color; 
	public int size; 
	
//	 constructor 생성자
	public Car() {
		this.name = "k1"; 
		this.color = "red";
		this.size = 1000;
	}
	public Car(String name, String color, int size) {
		this.name = name; 
		this.color = color;
		this.size = size;
	}
		
	// operation 행위
	public void go() {
		System.out.printf("%s, %s Go Car ...", this.name, this.color);
	}
	public void stop() {
		System.out.printf("%s, %s Stop Car ...", this.name, this.color);
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + "]";
	}

	
	
	
	
}
