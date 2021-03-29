package Constructor;

public class ParameterizedConstr {
	String city;

	  // constructor accepting single value
	public ParameterizedConstr(String name) {
	    city = name;
	    System.out.println(city + "Programming Language");
	  }

	  public static void main(String[] args) {

	    // call constructor by passing a single value
	    ParameterizedConstr obj1 = new ParameterizedConstr("Java ");
	    ParameterizedConstr obj2 = new ParameterizedConstr("Python ");
	    ParameterizedConstr obj3 = new ParameterizedConstr("C ");
	    
	  }

}
