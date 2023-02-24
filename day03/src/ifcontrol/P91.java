package ifcontrol;

public class P91 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 15;

		// 두가지 수의 최대 값과 최소 값을 구하시오

		int max = 0;
		int min = 0;

// 오답 1번 
//		if (a > b) {
//			if (b > c) {
//				max = a;
//				min = c;
//			} else {
//				max = a;
//				min = b;
//			}
//		} else if (b > a) {
//			if (a > c) {
//				max = b;
//				min = c;
//			} else {
//				max = b;
//				min = a;
//			}
//		} else if (c > a) {
//			if (a > b) {
//				max = c;
//				min = b;
//			} else {
//				max = c;
//				min = a;
//			}
//		}

// 2번
//		if ( a > b ) {
//			if ( a > c) {
//				max = a;
//				if ( b>c) {
//					min = c;
//				}else {
//					min = b;
//				} 
//			}
//		}else if ( b > a) {
//			if ( b > c) {
//				max = b;
//				if ( c > a) {
//					min = a;
//				}else {
//					min = c;
//				}
//			}
//		}else if ( c > a) {
//			if ( c > b) {
//				max = c;
//				if ( b > a) {
//					min = a;
//				}else {
//					min = b;
//				}
//			}
//		}

// 3번 삼항연산자 사용		
//		max = ( a > b )? 
//			  ( a > c )? a : c 
//					  :
//			  ( b > c )? b : c ;
//		max = ( a < b )? 
//			  ((a < c )? a : c)
//				  :
//			  (b  < c )? b : c ;

//// 4번 강사님 파일 확인해야 할 부분 
//		if (a > b) {
//			max = a;
//			min = b;
//			if (a > c) {
//				min = c;
//			}else {
//				if ( b > c ) {
//					min = c;
//				}
//			}
//		}else {
//			max = b;
//			min = a;
//			if ( b < c) {
//				max = c;
//			}else {
//				if ( a>c) {
//					min = c; // 여기 맞나 보자 
//				}
//			}
//		}
//

// 5번 API?활용 
		if ( a > b) {
			max = Math.max(a,c);
			min = Math.max(b,c);
		}else {
			max = Math.max(b,c);
			min = Math.max(a,c);
		}
		
		
		System.out.printf("MAX : %d, MIN : %d", max, min);
	}
}
