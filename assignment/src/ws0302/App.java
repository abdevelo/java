package ws0302;

public class App {

	public static void main(String[] args) {
		
		
		Account arrAcc [] = { new Account("james1", 10000, 0.35, "VIP"), 
						   new Account("james2", 10000, 0.45, "GOLD"),
						   new Account("james3", 10000, 0.55, "SIVER"),
						   new Account("james4", 10000, 0.15, "GOLD"),
						   new Account("james5", 10000, 0.28, "SIVER"),
						   new Account("james6", 10000, 0.31, "VIP") } ;
		
		for ( Account data : arrAcc) {
			System.out.println(data);
			double balance = data.getBalance();
			System.out.println("계좌별 현재 잔액 :"+ balance);
			double Interest = data.getInterest(data.getBalance(), data.getRate());
			System.out.println("계좌별 현재 이자 :"+Interest);
		}
		
		double sumBalance = 0.0;
		int cnt = 0;
	
		for ( Account data : arrAcc) {
			String grade = data.getGrade();
			if (grade.equals("VIP")) {
				double balance = data.getBalance();
				sumBalance += balance;
				cnt++;
			}
		}
		
		double avg = sumBalance / cnt;
		System.out.println("VIP고객 계좌 잔액의 합 :"+sumBalance);
		System.out.println("VIP고객 계좌 잔액의 평균 :"+avg);
	
	}
}
