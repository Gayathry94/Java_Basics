package corkollectionframe;
import java.util.*;

public class hashmap {
public static void main(String[] args) {
	 HashMap<String, Integer> numbers = new HashMap<>();

	    System.out.println("Initial HashMap: " + numbers);
	    // put() method to add elements
	    numbers.put("One", 1);
	    numbers.put("Two", 2);
	    numbers.put("Three", 3);
	    System.out.println("HashMap after put(): " + numbers);
	    
	    
	    HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);

	    // get() method to get value
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
	
}
}
