package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		// 1~10까지 숫자를 20개 입력
		// 단 while문을 이용
		
		Random r = new Random();
		
		while( list.size() < 20) {
			int num = r.nextInt(10)+1;			
			list.add(num);
		}
		System.out.println(list.size());
		System.out.println("---------------------------------");
		for ( int data : list ) { 
			System.out.println(data);	
		}
		System.out.println("---------------------------------");
		System.out.println(list);
	}

}
