package bank;

public class App { //App2 테스트 프로그램

	public static void main(String[] args) {
		Account acc = new Account("101010", "이말숙", 10000);
		System.out.println(acc);
		
		acc.withdraw(20000);
		acc.deposit(30000);
		System.out.println(acc);
	}

}
