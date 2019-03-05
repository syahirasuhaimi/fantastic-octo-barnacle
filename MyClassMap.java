//HashMAP
//more to remove duplicates data

import java.util.HashMap;


public class MyClassMap {

	public static void main(String[] args) {
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City) country is key, value is city
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities); 
	    
	    //for access the item
	    capitalCities.get("England"); 
	    
	    // for remove an item
	    capitalCities.remove("England"); //Remove key to remove all, couldnt remove the value.
	    System.out.println("After remove England: " +capitalCities);
	    
	    // for find out how many items there are
	    System.out.println(capitalCities.size());
	    
	    //FOR EACH LOOP
	    //Use the keySet() method for the KEYS, and values() method for VALUES
	    System.out.print("\nPrint Keys: \n");
	    for (String i : capitalCities.keySet()) { // Print keys
	    	System.out.println(i); 
	    }
	    
	    System.out.print("\nPrint Values: \n");
	    for (String i : capitalCities.values()) { // Print values	
	    	System.out.println(i);
	    }
	    
	    System.out.print("\nPrint Both: \n");
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i)); // Print both
	    }

	}

}
