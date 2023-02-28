package oop2;

import java.util.Random;

public class Employee {
	private String id;
	private String name;
	private int salary;

	// default constructor ( 요소를 입력하지 않아도 자동으로 생성)
	public Employee() {
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;
	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		if(salary < 0) {
			this.salary=0;
		}else {
		this.salary = salary;
		}
	}

	public Employee(String name, int salary) {
		this("10000",name,salary); //argument가 3개인 constructor가 자동적으로 호출
//		Random r = new Random();
//		this.id = String.valueOf(r.nextInt(100)+1);
		
	}
	
	

	public String getName() {
		return name;
	}

	//sources / getter and setter 
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	
	
	public int getAnnSalary() {
		return this.salary * 12;
	}

	public double getTax() {
		return this.salary * 0.175;
	}

	// id ,name, salary를 보여주는 식
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
