package inherit2;

public class Sales extends Employee {
	private String loc;
	private double rate;
	
	
	public Sales() {
	}
	
	public Sales(String id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}


	public Sales(String id, String name, double salary, String loc, double rate) {
		super(id, name, salary);
		this.loc = loc;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return super.toString()+""+loc+""+rate ;
	}




	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = getSalary() *12 + getIncentive();
		//this.getSalary()하면 employee건데 그냥 getSalary()하면 sales꺼
		return result;
	}
	
	
	@Override // 대신 재정의된 함수라고 알려줘야 함 
	public double getIncentive () {
		double result = 0.0;
		result = getSalary() * rate * 12;
		return result;
	}
	
	
	
	
	
}
