package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
//		List list = new ArrayList<Integer>(); 
//      이렇게도 가능. 자료형을 지정하지 않고 사용하여 모든 자료형이 들어갈 수 있지만, 이렇게 사용하는 경우는 없음. generic을 권장
		
		List<Integer> list = new ArrayList<Integer>();
		
		Random r = new Random();
		for ( int i = 0; i < 10 ; i ++) {
			int num = r.nextInt(10)+1;	
			list.add(num);
		}
		
//		list.add(10); // 데이터를 array에 집어넣을 때는 add( 넣을데이터 ) 
//		list.add(20);
//		list.add(30);
		// 객체 타입과 primitive type이 자유롭게 이동가능해서 이렇게 작성 다른 자료형은 안 된다고 함
		
		list.add(5, 100); // add(index, int) 'index'번째 값에 'int'값을 입력한다. 
		list.remove(5); // remove(index) 'index'번째 값에 입력된 값을 삭제한다.
		
		for ( int data : list ) { 
			System.out.println(data);	
		}
		
		System.out.println(list);
	}

}
