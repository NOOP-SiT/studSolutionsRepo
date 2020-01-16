package zad3_4;

public class Ship implements ICreateShip,IDescription {
      private String name;
      private String nameOf;
      private int number;
      private String capName;
      private String prop;
      
      
      public Ship(String name) {
    	  this.name=name;
    	  System.out.println(name);
    	  
      }
      
      
	


	@Override
	public String toString() {
		return "Created ship "+ name +  "\n [Ship name = " + nameOf + "] \n [Number of crew members = " + number + "] \n [Captain name = " + capName + "] \n [ Propulsion =" + prop + "]";
	}





	@Override
	public void description() {
	    
		System.out.println(toString());
	}

	@Override
	public void createShip(String nameOfShip) {
		this.nameOf=nameOfShip;
		
	}

	@Override
	public void createCaptain(String captainName) {
		this.capName=captainName;
		
	}

	@Override
	public void createCrew(int number) {
		this.number=number;
		
	}

	@Override
	public void createPropulsion(String prop) {
		this.prop=prop;
		
		
		
	}

}
