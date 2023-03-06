package inherit2;

public class Employee extends Object { // 자바의 모든 클래스는 이부분이 생략된 것일 뿐임
	private String id;
	private String name; 
	private double salary;
	
	public Employee() {
	}

	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getAnnSalary() {
		double result = 0.0;
		result = this.salary * 12;
		return result;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double getIncentive() {
		return 0.0; 
	} // employee의 incentive는 이론적으론 없으니 0을 주면 됨. (꼼수)

	@Override
	public String toString() {
		return id+ "\t" + name + "\t" + salary ;
	}
	
	
	
}
