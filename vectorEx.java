import java.util.*;

public class vectorEx {

	public static void main(String[] args) {

		Vector<String> vec = new Vector<String>(2); 

	    /* Add element now contain 4 elements*/
	    vec.addElement("Apple");
	    vec.addElement("Orange");
	    vec.addElement("Mango");
	    vec.addElement("Fig");

	    /* check size and capacityIncrement*/
	    System.out.println("Size is: "+vec.size()); //now size increase by 2+2 = 4
	    System.out.println("Default capacity increment is: "+vec.capacity()); //now capacity is 4 

	    //add another 3 element
	    vec.addElement("fruit1"); 
	    vec.addElement("fruit2");
	    vec.addElement("fruit3");

	    /*size and capacityIncrement after two insertions*/
	    System.out.println("Size after addition: "+vec.size()); //now size increase by 4+3=7
	    System.out.println("Capacity after increment is: "+vec.capacity()); // now capacity is 4+4=8

	    /*Display Vector elements*/
	    Enumeration en = vec.elements(); //Enumeration defines the methods by which you can enumerate (obtain one at a time) the elements in a collection of objects.
	    System.out.println("\nElements are:");
	    
	    while(en.hasMoreElements())
	    	System.out.print(en.nextElement() + " ");

	}

}
