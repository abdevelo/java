package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Account acc = null; // acc 참조변수를 초기화 한다. 전역에서 사용하기 위해.
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input Command(c,w,d,s,q)..");
			String cmd = sc.next();
			
			if (cmd.equals("q")) {
				System.out.println("Bye ...");
				break;
				
			} else if (cmd.equals("c")) {
				System.out.println("Create Account ...");
//				String accNum = getAccNum(); ?? 모르겠음
				System.out.println("Input Account Info[name,balance] ...");
				
				
				System.out.println("Input Name:");
				String name = sc.next();
				System.out.println("Input Balance:");
				double balance = Double.parseDouble(sc.next());
				
				acc = new Account(name, balance);

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
				
			} else if (cmd.equals("s")) {
				System.out.println("Select : ");
				System.out.println(acc);
			}
		}
		sc.close();
	}

}
