package board;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service(); // App안에서 객체를 생성. service의 메소드를 이용하기 위해
		while(true) {
			System.out.println("Input cmd(r,u,d,g,q)");
			String cmd = sc.next();
			if ( cmd.equals("q")) {
				System.out.println("Bye.");
				break;
			}else if (cmd.equals("r")) {
				System.out.println("Input Contents");
				String content = sc.next(); 
				service.register(content); // 글을 등록하는 기능에다가 화면에서 받은 글을 넣어줌
				
			}else if (cmd.equals("g")) { // 글을 가져와라 
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next()); // 화면에서 입력한 건 string이니까 int로 변환 필수 
				String result = service.get(num);
				System.out.println(result);
				
			}else if (cmd.equals("d")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				service.remove(num);
				
			}else if (cmd.equals("u")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				System.out.println("Input Content");
				String content = sc.next();
				service.modify(num,content);
			}
		}
		sc.close();
	}

}
