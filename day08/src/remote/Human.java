package remote;

public class Human {

	public static void main(String[] args) {
		Remote remote = new Tv() ;
		remote.turnOn();
		remote.turnOff();
//		
//		Remote remote = new Audio() ;
//		remote.turnOn();
//		remote.turnOff();
	}
}
