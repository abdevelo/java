package shape;

public abstract class Shape {
	protected int x;
	protected int y;
	
	
	public Shape() {
	}


	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Abstract Method
	public abstract double getArea();

	public abstract double getCircumn();
	
	
	public String getXY() {
		// String result x = "";
		// String result y = ""; 는 이번주부터 생략하기 
		
		
		return x + " , " + y ;
	}

}
