package bank;

public class Atm {

	public static void main(String[] args) {
		
		Account acc1 = null; // try 구문 밖에서 초기화하는 것을 습관화
		
		try {
			acc1 = new Account(10000);
			System.out.println(acc1);
			acc1.withdraw(20000);
		} catch (Exception e) {
			System.out.println(MakeMessage.makeMessage(e.getMessage()));
			System.out.println(e.getMessage());
		}
	}

}
