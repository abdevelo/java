package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	private HashSet<Integer> winningNum;
	private double prizeMoney;
	
	public Lotto() {
		this.makeWinningNumberMoney();
	}

	/*************************method *************************/
	
	public void makeWinningNumberMoney() {
		
		Random r = new Random();
		HashSet<Integer> winningNum  = new HashSet<Integer>();

		while ( winningNum.size() < 3){
			int rndnum = r.nextInt(25) + 1;
			winningNum.add(rndnum);
		}
		this.winningNum = winningNum;
		
		double prizeMoney = r.nextInt(2000000000) + 1;
		this.prizeMoney = prizeMoney;
	}

	public int checkRanking(ArrayList<Integer> myNum) {
		int grade = 4;
		for ( int i = 0; i < myNum.size(); i++) {
			if (winningNum.contains(myNum.get(i))) {
				grade--;
			}
		}
		return grade;
	}
	
	public double prizeMoney(int grade) {
		double result = 0.0;
		switch (grade) {
		case 1 : result = prizeMoney*0.5; break;
		case 2 : result = prizeMoney*0.3; break;
		case 3 : result = prizeMoney*0.2; break;
		default : result = prizeMoney*0.0; break;
		}
		return result;
	}
		
/*************************getters and setters *************************/


	public void setWinningNum(HashSet<Integer> winningNum) {
		this.winningNum = winningNum;
	}
	
	
	public HashSet<Integer> getWinningNum() {
		return winningNum;
	}

	public void setPrizeMoney(double prizeMoney) {
		this.prizeMoney = prizeMoney;
	}
	
	public double getPrizeMoney() {
		return prizeMoney;
	}

	
	@Override
	public String toString() {
		return "Lotto [winningNum=" + winningNum + ", prizeMoney=" + prizeMoney + "]";
	}

	
	
}
