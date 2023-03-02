package ws0302;


public class Account {
	
	private String accNum;
	private String addName;
	private double balance;
	private double rate;
	private String grade;
	
	public Account() {
		MakeAccountNumber makenum = new MakeAccountNumber();
		this.accNum = makenum.makeAccNum();
	}

	public Account(String accNUM, String addName, double balance) {
		this();
		this.accNum = accNUM;
		this.addName = addName;
		this.balance = balance;
	}
	
	public Account(String addName, double balance, double rate, String grade) {
		this();
		this.addName = addName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}



	public void withdraw (double money) {
		balance -= money;
	}
	
	public void deposit (double money) {
		balance += money;
	}
	
	public double getInterest ( double balance, double rate) {
		double interest = 0.0;
		interest = (balance * rate);
		return interest;
	}
	
	
	public double getBalance() {
		return balance;
	}

	public double getRate() {
		return rate;
	}

	public String getGrade() {
		return grade;
	}



	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", addName=" + addName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
	}
	
	
	

}
