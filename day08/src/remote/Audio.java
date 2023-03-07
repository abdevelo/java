package remote;

public class Audio implements Remote {

	@Override
	public void turnOn() {
		System.out.println("Trun on Audio");		
	}

	@Override
	public void turnOff() {
		System.out.println("Trun off Audio");		
	}

}
