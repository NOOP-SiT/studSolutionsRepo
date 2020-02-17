package zad1;

public class CarDriver implements IStartStop,ILandDrive {
	
	private String name;
	 
	
	public CarDriver(String name) {
		this.name=name;
		
	}
	
	

	@Override
	public String toString() {
		return "CarDriver [name=" + name + "]";
	}



	@Override
	public void startEngine() {
		System.out.println("Driver "+name+ " is starting the engines...");
		
	}

	

	@Override
	public void stopEngine() {
		System.out.println("Driver "+name+" turned engines off...");
		
	}

	@Override
	public void changeSpeed() {
		System.out.println("Driver "+name+" is changing speed...");
		
	}

	@Override
	public void drive() {
		System.out.println("Driver "+name+" is driving a car...");
		
	}
	
	
	
	

}
