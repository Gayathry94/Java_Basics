package corkollectionframe;
import java.util.*;
public class priorityqueue {
	public static void main(String[] args) {
		 PriorityQueue<Integer> numbers = new PriorityQueue<>();
	        numbers.add(4);
	        numbers.add(2);
	        numbers.add(1);
	        System.out.println("PriorityQueue: " + numbers);
	        numbers.offer(1);
	        numbers.offer(8);
	        System.out.println("Updated PriorityQueue: " + numbers);
	        int number = numbers.peek();
	        System.out.println("Accessed Element: " + number);
	        
	        boolean result = numbers.remove(2);
	        System.out.println("Is the element 2 removed? " + result);
	        System.out.println(numbers);
	        int number1 = numbers.poll();
	        System.out.println("Removed Element Using poll(): " + number1);

	        Iterator<Integer> iterate = numbers.iterator();
	        while(iterate.hasNext()) {
	            System.out.print(iterate.next());
	            System.out.print(", ");
	        }
	        
	}

}
