package remote;

public class Tv implements Remote {

	@Override
	public void turnOn() {
		System.out.println("Trun on TV");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Trun off TV");		
	}

}
