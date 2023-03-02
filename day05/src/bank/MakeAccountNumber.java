package bank;

import java.util.Calendar;

public class MakeAccountNumber {
	public String makeAccNum() {
		String accNum = "";
		Random r = r.nextIn();
		
		Calendar cal = Calendar.getInstance();
		accNum = ""+cal.get(Calendar.YEAR)
				   +(cal.get(Calendar.MONTH)+1)
		           +cal.get(Calendar.DAY_OF_MONTH)
				   +cal.get(Calendar.MILLISECOND);
		return accNum;
	}
	
}
