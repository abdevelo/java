package ws0307;

import java.util.Scanner;

public class App {

	// 계좌 생성
	// 계좌 정보 조회
	// 계좌 입금 
	// 계좌 출금 
	
	public static void main(String[] args) throws minusMoney, minusBalance {
	
		Account acc = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input Command(c,s,d,w,q)..");
			String cmd = sc.next();
			
			if (cmd.equals("q")) {
				System.out.println("Bye ...");
				break;
				
			} else if (cmd.equals("c")) {
				System.out.println("Create Account ...");
				System.out.println("Input Account Info[name,accHolder,balance] ...");
				System.out.println("Input Name:");
				String name = sc.next();
				System.out.println("Input accHolder:");
				String accHolder = sc.next();
				System.out.println("Input Balance:");
				double balance = Double.parseDouble(sc.next());
				acc = new Account(name, accHolder, balance);

				System.out.println(acc);

			} else if (cmd.equals("s")) {
				System.out.println("Select : ");
				System.out.println(acc);
			
			} else if (cmd.equals("w")) {
				System.out.println("Withdraw : ");
				System.out.println("Input withdraw Money ...");
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);
				System.out.println(acc);

			} else if (cmd.equals("d")) {
				System.out.println("Deposit : ");
				System.out.println("Input Deposit Money ...");
				double money = Double.parseDouble(sc.next());
				acc.deposit(money);
				System.out.println(acc);
				
			} 
		}
		sc.close();	
	}
}