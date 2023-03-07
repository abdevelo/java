package variable;

public class P69 {

	public static void main(String[] args) {
		String str = "abcdef" ; // 100번지 주소
		str = str.toUpperCase(); // 101번지 주소 (왜냐면 스트링 주소는 바꿀 수 없기에) 
		//입력을 소문자로 한다고 해도 대문자로만 저장 및 비교하기 위함
		System.out.println(str);
		
		String str2 = str.replace('A','Z');
		// str 에는 주소가 있기 때문에 주소에 접근하기 위한 '.' 을 뒤에 달아 실행
		// 주소를 가진 값(string 등)에 뭔가를 하고 싶으면 쩜을 친다!
		// replace ( a , b ) : a->b 로 대체 
		//
		System.out.println(str2);
		
		int lng = str.length();
		System.out.println(lng);
		
		int t = str.indexOf('B'); // index : 내가 원하는 문자가 몇번째인지 확인할 때 
		System.out.println(t);
		
		char c = str.charAt(0); // charAt : 은 0번째 character를 찾는 것이므로 변수자료형도 맞춰주기
		System.out.println(c);
		
		
		String str3 = str.substring(1,3); // substring : 1번부터 3개의 string을 가져온다
		System.out.println(str3);
		
//		String email = "jmlee@tonesol.com";
//				
//		String id = "";
//		String domain = "";
//		
//		
//		System.out.println("%s, %s",id,domain);
//	} 후에 워크샵 한다고 하심 
	}
}
