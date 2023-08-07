package corkollectionframe;
import java.util.ArrayList;
import java.util.Iterator;

public class animals {
	public static void main(String[] args){
        ArrayList animals = new ArrayList();
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("cow");
        ArrayList fruits= new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grapes");
        fruits.add("orange");
        Iterator itr=fruits.iterator();
        while(itr.hasNext())
        {
         System.out.println(itr.next()); 
        }  
        
        
        ArrayList letter= new ArrayList();

        letter.add("A");
        letter.add("B");
        ArrayList primeNumbers = new ArrayList();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("ArrayList: " + animals);
        System.out.println(animals.get(2));
      //  System.out.println(animals.set(0,"rat"));
        System.out.println(animals.addAll(fruits));
        System.out.println(animals);
        System.out.println(letter);
        letter.clear();
        System.out.println(letter);
        System.out.print("Is orange is present in the arraylist: ");
        System.out.println(fruits.contains("orange"));
        System.out.println(fruits.contains("pineapple"));
        int size =fruits.size();
        System.out.println("Length of  fruit ArrayList: " + size);
       
//       int r=primeNumber.remove(2);
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
          System.out.println(i);
        }
        
        
	}
}