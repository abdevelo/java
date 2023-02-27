package array;

import java.util.Scanner;

public class P121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //화면에서 입력해서 값을 가져오겠다. 
		while(true) {
			System.out.println("Input Command[q,i,s]");
			String cmd = sc.next(); //입력된 값을 cmd라는 변수에 입력한다.
			if(cmd.equals("q")){
				System.out.println("Quit...");
				break;
			}else if (cmd.equals("i")){
				System.out.println("Insert...");
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				System.out.printf("%s,%s,%s Inserted...\n ", id,pwd,name);
			}else if (cmd.equals("s")){
				System.out.println("Select...");				
			}else { ; // if ~ else if ~ else 는 잘못된 값을 필더링을 할 수가 있다. 
			System.out.println("Invalid Command...");
			System.out.println("Try Again...");
			}
		} //end while
		System.out.println("Bye..."); // break가 없으면 unreachable 이 됨.
		sc.close();
	}

}
