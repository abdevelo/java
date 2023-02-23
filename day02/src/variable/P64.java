package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 10.2345;
		String str1 = "abc";
		String str2 = "abc";
		str1 = "def";
		
		System.out.printf("%d %4.2f %s", a,d,str1);
		
		// 첫번째 if문은 '주소'를 비교
		if (str1 == str2) {
			System.out.println("\nOK");
		}
		// \n 은 다음줄로 넘어가라 
		
		// 두번째 if문은 문구를 비교
		if (str1.equals(str2)) {
			System.out.println("\nOK");
		}
		String str3 = new String("abc");
		String str4 = new String("abc");
		// new 로 클래스를 선언하는 경우 내부 내용이 같더라도 주소를 새로 생성
		// 실무적으로 문자열을 쓸 때 new를 쓸 일은 많이 없음
		
		if ( str3 != str4 ) {
			System.out.println("\nOK");
		}
	}

}
