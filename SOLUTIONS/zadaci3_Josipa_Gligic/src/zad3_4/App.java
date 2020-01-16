package zad3_4;

public class App {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		
		Ship ship=new Ship("Pirate Ship");
		
		System.out.println("-------------------------------");
		ship.createShip("Black Pearl");
		ship.createCaptain("Captain Jack Sparrow");
		ship.createCrew(15);
		ship.createPropulsion("Pirate Ship is sailing on the wind");
		ship.description();
		
		System.out.println("__________________________________");
		System.out.println("----------------------------------");
		
		Ship ship1=new Ship("Tanker Ship");
		
		System.out.println("-----------------------------------");
		ship1.createShip("Barbara");
		ship1.createCaptain("Kapetan Ime Prezime");
		ship1.createCrew(20);
		ship1.createPropulsion("Tanker is sailing on the wind");
		ship1.description();
		
		System.out.println("____________________________________");

	}

}
