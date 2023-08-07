 package examples;

import java.util.Scanner;

public class evenoroddarraydemo {
	
	static int ab[]=new int[10];
	static int ac[]=new int[10];
    
	static int xy=0;
	static int yz=0;
	
	public void oddeven(int x)
	{
		int value=x;
		System.out.println(value);
		if(x%2==0)
	 	{
	 	
	 		ab[xy]=value;
	 		xy++;

	 	}
	 	else
	 		
	 	{
	 	ac[yz]=value;
	 	yz++;

	 		

	 	}
	 	
		
	}
	

		
	public static void main(String[] args) {
 		Scanner obj1=new Scanner(System.in);
 		System.out.println("enter the limit");
 		int limit=obj1.nextInt();
 		int a[]=new int[limit];
 		int i;
 		evenoroddarraydemo obj=new evenoroddarraydemo();

 		System.out.println("enter the numbers");
 for(i=0;i<limit;i++)
 			
 		{
 			a[i]=obj1.nextInt();
 			
 			
 		}
 
 
 
 for(i=0;i<limit;i++)
	 
 {
	
obj.oddeven(a[i]);
		
 }

 	

 	
 
 System.out.println("The even numbers are ");
	
 for(int c=0;c<10;c++)
 {
	 System.out.println(ab[xy]);
 }
 System.out.println("The odd numbers are ");
	
 for(int d=0;d<10;d++)
 {
	 System.out.println(ac[yz]);
 }
 
 	}

 
	}

