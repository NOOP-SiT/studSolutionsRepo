package zad1;

public class ShipCaptain implements IStartStop,IWaterDrivers {
	
	private String name;
	
	public ShipCaptain( String name) {
		this.name=name;
	}

	@Override
	public void sailInto() {
		System.out.println("Ship Captain "+name+" is sailing into harbour...");
		
	}

	@Override
	public void sailOut() {
		System.out.println("Ship Captain "+name+" is sailing out of the harbour...");
	}

	@Override
	public void navigate() {
		System.out.println("Ship Captain "+name+" is navigating the ship...");
		
	}

	@Override
	public void startEngine() {
		System.out.println("Ship Captain "+name+" is starting the engines...");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Ship Captain "+name+" turned the engines off...");
		
	}
	
	

}
