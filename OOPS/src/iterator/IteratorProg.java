package iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorProg {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    Iterator <String> it = cars.iterator();

	    while(it.hasNext()) {
	    	  System.out.println(it.next());
	    	}
	}

}
