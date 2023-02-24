package ifcontrol;

public class P87 {

	public static void main(String[] args) {
		
		String grade = "VIP" ;
		String gender = "M" ;
		double sum = 95.0;
		
		System.out.println("Start....");
		

			
			if(gender.equals("M")) {
				System.out.println("Male....");
			}else {
				System.out.println("Female....");
			}
			
			
			
			if (( sum <= 100.0 && sum >= 95.0) || ( sum <= 90.0 && sum >= 85.0)) {
				grade = "VIP";
			}else if (( sum <= 80.0 && sum >= 75.0) || (sum <= 65.0 && sum >= 60.0)) {
				grade = "GOLD";
			}else {
				grade = "NORMAL";
			}
			
			
			if(grade.equals("VIP")) {
				System.out.println("VIP 혜택....");
	//			return;
			}
			
			System.out.printf("%s, %s, %f \n", grade, gender, sum);
			System.out.println("End....");
		}
	}
	

