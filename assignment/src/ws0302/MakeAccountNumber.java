package ws0302;

import java.util.Calendar;
import java.util.Random;

public class MakeAccountNumber {
	public String makeAccNum() {
		String accNum = "";
		
		Random r = new Random();
		int rnd = r.nextInt(100);
		
		Calendar cal = Calendar.getInstance();
		accNum = ""+cal.get(Calendar.YEAR)
				   +(cal.get(Calendar.MONTH)+1)
		           +cal.get(Calendar.DAY_OF_MONTH)
		           +rnd;
		return accNum;
	}
	
}
