package bank;
//
//import cal.InfinityException;

public class Account {
	private String accNo ;
	private String name;
	private String accHolder;
	private double balance;
	
	
	// Constructor - 음수 예외 상황 
	
	public Account() {
		MakeAccountNumber makenum = new MakeAccountNumber();
		this.accNo = makenum.makeAccNum();
	}

	public Account(String name, String accHolder, double balance) throws minusBalance {
		this();
		this.name = name;
		this.accHolder = accHolder;
		
		if ( balance < 0 ) {
			throw new minusBalance("MB001");
		}else {
			this.balance = balance;
		}
	}
	

	public Account(String accNo, String name, String accHolder, double balance) throws minusBalance {
		this();
		this.name = name;
		this.accHolder = accHolder;
		
		if ( balance < 0 ) {
			throw new minusBalance("MB001");
		}else {
			this.balance = balance;
		}
	}

	
	

	
	// 계좌정보 조회
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}
	
	// 잔액 조회
	
	public double getBalance() {
		return balance;
	}
			
	// 입금 - 음수 예외 상황
	
	public void deposit(double money) throws minusMoney {
		
		if (money > 0) {
			balance += money;
		}else {
			throw new minusMoney("MM001");
		};
	}
	// 출금 - 잔액 부족 예외 상황, 음수 예외 상황
	
	
	public void withdraw(double money) throws minusMoney, minusBalance {
		
		if (money > 0) {
			balance -= money;
		}else {
			throw new minusMoney("MM001");
		};
		
		if ( balance-money < 0 | balance == 0  ) {
			throw new minusBalance("MB001");
		}
	
	}

	
	

//	public String getAccNo() {
//		return accNo;
//	}


	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAccHolder() {
		return accHolder;
	}


	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	
	
	
}
