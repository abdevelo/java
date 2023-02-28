package oop3;

import java.util.Scanner;

public class Car {
	private String name ;
	private String color; 
	private int size; // 배기량
	private int fsize; // 기름통 사이즈 
	private int cfsize; // 현재 기름의 양
	
	public Car() {
	}

	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}

	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name,color,size,fsize);
		this.cfsize = cfsize;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	} // sources + toString 으로 생성가능 이 클래스에서 만드는 값을 출력하는 역할
	
	
	
	/* 기름을 넣는다. ->리턴되는 게 없음(void)4
	 * 기름통보다 많이 넣으면 다시 주유하세요.
	 * 음수값이 들어가면 다시 주유하세요.
	*/
	
	
	public void setCfsize(int size) {
		
		
		if (( size<=0 ) || ( cfsize+size > fsize )) {
			System.out.println("다시 주유 하세요");
			return;
		}
		cfsize += size;
	}
		
//		cfsize = size;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("주유량을 입력하세요.");
//		int fuel = sc.nextInt();
//		
//		
//		if ( fuel < 0 ) {
//			System.out.println("다시 주유 하세요.");
//		}else {
//			if ( fuel > (fsize-cfsize) ) {
//				System.out.println("다시 주유 하세요.");	
//			}else {
//				cfsize += fuel;
//				System.out.printf("%d L를 주유하여 현재 주유량은 %d입니다.", fuel, cfsize);	
//			}
//		}
//		sc.close();
//	}
//	

	
		
	// 주행을 한다.
	// 1리터당 10km를 주행 할 수 있다. =10km주행하면 1리터가 소진된다.
	public void go(int distance) {

		
		if ( cfsize < 0 || cfsize < (distance/10)) {
			System.out.println("주유하시고 출발 하세요.");
			return;
		}
			cfsize = cfsize - (distance/10);
		
		System.out.printf("%s Go ...", this.name);
	}
	
	
	
	// 멈춘다.
	public void stop() {
		System.out.printf("%s Stop ...", this.name);
	}
	
}
