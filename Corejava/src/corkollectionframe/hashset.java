package corkollectionframe;
import java.util.HashSet;
import java.util.Iterator;
public class hashset {
	public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.size());
	    Iterator<String> i=cars.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  

	    
	    System.out.println(cars.contains("Mazda"));
	    System.out.println(cars.remove("Volvo"));
	    System.out.println(cars);
	    
	    
	    HashSet<Integer> evenNumber = new HashSet<>();

       
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);
  HashSet<Integer> numbers = new HashSet<>();
        
      
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet2: " + evenNumbers);

       
        evenNumbers.retainAll(primeNumbers);
        System.out.println("Intersection is: " + evenNumbers);
	  }
	
}
