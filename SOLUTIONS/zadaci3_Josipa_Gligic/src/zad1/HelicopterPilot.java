package zad1;

public class HelicopterPilot implements IStartStop,IPilots {
	 private String name;
	 
	public HelicopterPilot(String name) {
		this.name=name;
	}

	@Override
	public void takeOff() {
		System.out.println("Helicopter Pilot "+name+" is taking off...");
		
	}

	

	@Override
	public void manuever() {
		System.out.println("Helicopter Pilot "+name+" is manuevering a helicopter...");
		
	}

	@Override
	public void fly() {
		System.out.println("Helicopter Pilot "+name+" is flying a helicopter...");
		
	}

	@Override
	public void safeLand() {
		System.out.println("Helicopter Pilot "+name+" landed safe...");
		
	}

	@Override
	public void startEngine() {
		System.out.println("Helicopter Pilot "+name+" is starting the engines...");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Helicopter Pilot "+name+" turned off engines...");
		
	}

}
