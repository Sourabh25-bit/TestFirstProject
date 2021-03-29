package Constructor;

public class Constructor {
//	This is example of DEFAULT Constructor.
	 int a;
	 boolean b;
	 String name; 
	 char c;
	 double d;
	  public static void main(String[] args) {

	    // A default constructor is called
		  Constructor obj = new Constructor();

	    System.out.println("Default Value:");
	    System.out.println("a = " + obj.a);
	    System.out.println("b = " + obj.b);
	    System.out.println("Name = " + obj.name);
	    System.out.println("Char = " + obj.c);
	    System.out.println("Double = " + obj.d);
	    
	  }

}
