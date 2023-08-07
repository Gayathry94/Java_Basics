package corkollectionframe;
import java.util.*;
public class linkedlist1 {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		  
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");
        Iterator itr=list.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }
        System.out.println("The list is:" + list);
  
        
        list.add("Last");
        list.add("Element");
  
        
        System.out.println("The new List is:" + list);
        list.remove(0);
        list.remove(3);

        System.out.println("The new List is:" + list);

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        
        
        cars.addFirst("Mazda");
        System.out.println(cars);
        cars.addLast("maruti");
        System.out.println(cars);
        
        cars.removeFirst();
        System.out.println(cars);
        cars.removeLast();
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
	}

}
