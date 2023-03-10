package statics;

public class Car {
	private String name;
	private String maker; //제조사
	public static String makerName = "HD"; // static은 객체가 생성될 때 관여 x
	
	public Car() {
	}
	
	public Car(String name) {
		this.name = name;
	}

	public Car(String name, String maker) {
		this.name = name;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", maker=" + maker + "]";
	}
	

	
	
	
	
}
