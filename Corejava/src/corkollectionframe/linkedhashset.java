package corkollectionframe;
import java.util.*;

public class linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five"); 
        set.add("Two");
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
        System.out.println("numbers are "+set);
        System.out.println(set.remove("Good"));
        System.out.println(set.remove("Three"));
        System.out.println("numbers are "+set);

	}

}
