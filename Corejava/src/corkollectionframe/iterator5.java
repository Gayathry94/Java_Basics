package corkollectionframe;
import java.util.*;

public class iterator5 {
public static void main(String[] args) {
	TreeSet<String> set=new TreeSet<String>();  
    set.add("Ravi");  
    set.add("Vijay");  
    set.add("Ajay");  
    System.out.println("Traversing element through Iterator in descending order");  
    Iterator i=set.descendingIterator();  
    while(i.hasNext())  
    {  
        System.out.println(i.next());  
    }  
      
}
}
