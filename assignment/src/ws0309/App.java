package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {

		ArrayList<Integer> myNum = new ArrayList<Integer>();
		Lotto L = new Lotto();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 로또 번호 입력(1~25사이의 정수): ");
		try {
			while (myNum.size() < 3) {
				int a = sc.nextInt();
				if (a < 1 | a > 25) {
					throw new Exception();
				}
				myNum.add(a); 
			}
		}catch (Exception e ) {
			System.out.println("잘못 입력하셨습니다.(1~25사이의 정수)");
			throw new Exception();
		}finally {sc.close();}

		
		System.out.print("본인의 로또 번호를 결정하셨습니다 :");	
		System.out.println(myNum);
		System.out.print("행운의 로또 당첨 번호 입니다. :");
		System.out.println(L.getWinningNum());
		System.out.printf("총 당첨 금액은 %.0f 입니다.\n",(L.getPrizeMoney()));
		System.out.println("-----축-------------하-------");
		int grade = L.checkRanking(myNum);
		System.out.printf("%d 등 당첨입니다. \n", grade);
		System.out.printf("상금은 %.0f 원 입니다.", L.prizeMoney(grade));
	
		
	}

}
