package bank;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	
	
	public Account() {
		MakeAccountNumber makenum = new MakeAccountNumber();
		this.accNum = makenum.makeAccNum();
	}
	
	
	// accNum 수집 없이 계좌 만들 때 
	public Account(String accName, double balance) {
		this.accName = accName;
		this.balance = balance;
	}

	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}
	
	public void withdraw(double money) {
		if( money <= 0 ) {
			System.out.println("출금 금액을 확인 하세요");
			return;
		}
		
		if( this.balance < money ) {
			System.out.println("잔액을 확인 하세요");
			return;
		}
		
		balance -= money;
	}
	
	public void deposit(double money) {
		if( money <= 0 ) {
			System.out.println("입금 금액을 확인 하세요");
			return;
		}
		this.balance += money;
	}
	
	//getter and setter
	
	public double getBalance() { //잔액조회
		return balance;
	}


//	public String getAccNum() {
//		return accNum;
//	}
//	
	



	
	
	
	
	
	
	
}
