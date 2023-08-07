package corkollectionframe;

import java.util.Iterator;
import java.util.TreeSet;

public class iterator {
	public static void main(String[] args) {
		
	
	TreeSet<Integer> evenNumbers = new TreeSet<>();

    
    evenNumbers.add(2);
    evenNumbers.add(4);
    evenNumbers.add(6);
    System.out.println("TreeSet: " + evenNumbers);

    TreeSet<Integer> numbers = new TreeSet<>();
    numbers.add(1);

    // Using the addAll() method
    numbers.addAll(evenNumbers);
    System.out.println("New TreeSet: " + numbers);
    Iterator iterate = numbers.iterator();
    while(iterate.hasNext()) {
        System.out.print(iterate.next());
        System.out.print(", ");

        
        
    }
    boolean value1 = numbers.remove(5);
System.out.println("");
    System.out.println("Is 5 removed? " + value1);
    boolean value2 = numbers.removeAll(numbers);
    System.out.println("Are all elements removed? " + value2);
    System.out.println(numbers);
	}
}
