package ifcontrol;

public class P89 {

	public static void main(String[] args) {
		
		String grade = "VIP" ;
		String gender = "F" ;
		double sum = 90.0;
		
		System.out.println("Start....");
		

			
			if(gender.equals("M")) {
				System.out.println("Male....");
			}else {
				System.out.println("Female....");
			}
			
			
//			if (( gender.equals("M")) && (sum >= 90.0)) {
//				grade  = "MVIP";
//			}else if (( gender.equals("F")) && (sum >= 90.0)) {
//				grade  = "FVIP";
//			}else if (( gender.equals("M")) && (sum >= 80.0)) {
//				grade  = "MGOLD";
//			}else if (( gender.equals("F")) && (sum >= 80.0)) {
//				grade  = "FGOLD";
//			}else if (( gender.equals("M")) && (sum < 80.0)) {
//				grade  = "MNORMAL";
//			}else if (( gender.equals("F")) && (sum < 80.0)) {
//				grade  = "FNORMAL";
//			}
// 위의 코드형식 보다 가지를 나눠서 코드를 짤 수 있는 방법을 생각하기 아래처럼
			
			
			if (gender.equals("M")) {
				if (sum >= 90.0) {
					grade = "MVIP";
				}else if ( sum >= 80.0) {
					grade = "MGOLD";
				}else grade = "MNORMAL" ;
			}else {
				if (sum >= 90.0) {
					grade = "FVIP";
				}else if ( sum >= 80.0) {
					grade = "FGOLD";
				}else grade = "FNORMAL" ;
			}
			
//위를 삼항연산자로 
			
			grade = (gender.equals("M")) ? ( sum >= 90.0)? "MVIP" : (sum >= 80.0)? "MGOLD":"MNORMAL" :
				                           ( sum >= 90.0)? "FVIP" : (sum >= 80.0)? "FGOLD":"FNORMAL" ;
		
			
			

			
			
			
			switch(grade) {
			case "FVIP" :
//				sum += 100; // 이렇게 if문보다 간단하게 만들 수 있다. FVIP, MVIP가 같은 실행 내용을 함.
//				break;
			case "MVIP" :
				sum += 100;
				break;
			case "FGOLD" :
//				sum += 90;
//				break;
			case "MGOLD" :
				sum += 90;
				break;
			default : 
				sum +=10;
			}
//			
//			switch(grade) {
//			case "FVIP":
//			case "MVIP":
//				sum += 100;
//			case "FGOLD":
//			case "MGOLD":
//				sum += 90;
//			default :
//				sum += 10;
//			}
// 이런식으로 switch문에 각 case별 break를 빼면, VIP들은 100+90+10 으로 각 등급 별 혜택을 누적해서 받음
// 이런 경우는 관리자 권한 부여시에 많이 사용
			
			
			
			System.out.printf("%s, %s, %f \n", grade, gender, sum);
			System.out.println("End....");
		}
	}
	

