package Constructor;

public class NoArgsConstr {
	String name;

	  // public constructor
	  public NoArgsConstr() {
	    name = "Programiz";
	  }
	
	  public static void main(String[] args) {

	    // object is created in another class
		  NoArgsConstr obj = new NoArgsConstr();
		  System.out.println("Company name = " + obj.name);
	  }

}
