package examples;

import java.util.Scanner;

public class arrayreverse {
public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=ob.nextInt();
		int a[]=new int[limit];
		int i;
		System.out.println("enter the numbers");
 		for(i=0;i<limit;i++)
 		{
 			a[i]=ob.nextInt();
 		}
 		int rem,rev=0;
 		for(i=0;i<limit;i++)
 		{
 			int x=a[i];
 		while(x>0)
		 {
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
	
		 }
	
 		
 		if(a[i]==rev)
 		{
 			System.out.println("The palindrome numbers are "+a[i]);
 		}
}
}
}
