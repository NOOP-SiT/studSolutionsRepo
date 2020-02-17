package zad1;

public class AirPlanePilot implements IStartStop,IPilots {
	
	private String name;
	
	public AirPlanePilot(String name) {
		this.name=name;
		
	}

	@Override
	public void takeOff() {
		System.out.println("Airplane Pilot "+name+" is taking off...");
		
	}

	@Override
	public void manuever() {
		System.out.println("Airplane Pilot "+name+" is manuevering an airplane...");
		
	}

	@Override
	public void fly() {
		System.out.println("Airplane Pilot "+name+" is flying an airplane...");
		
	}

	@Override
	public void safeLand() {
		System.out.println("Airplane Pilot "+name+" had a safe landing....");
		
	}

	@Override
	public void startEngine() {
		System.out.println("Airplane Pilot "+name+" started the engines...");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Airplane Pilot "+name+" turned off the engines...");
		
	}
	
	

}
