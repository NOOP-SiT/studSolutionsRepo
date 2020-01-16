package zad1;

public class App {

	public static void main(String[] args) {
		CarDriver cardr=new CarDriver("Matej");
		cardr.startEngine();
		cardr.drive();
		
		System.out.println("-----------------------------------");
		
		HelicopterPilot heliPi=new HelicopterPilot("Luka");
		heliPi.fly();
		heliPi.takeOff();
		heliPi.stopEngine();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
		ShipCaptain shiC=new ShipCaptain("Petra");
        shiC.sailOut();
        shiC.stopEngine();
        shiC.startEngine();
        shiC.sailInto();
        
        System.out.println("____________________________________");
        
        AirPlanePilot airP=new AirPlanePilot("Matea");
        airP.fly();
        airP.manuever();
        airP.safeLand();
        airP.stopEngine();
	}

}
