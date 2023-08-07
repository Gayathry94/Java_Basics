package examples;
import java.util.Scanner;
public class oddevenarraynew {
	
	public void oddeven(int x)
	{
		int value=x;
		
		if(x%2==0)
	 	{
	 	
	 		System.out.println(x+"the number is even ");

	 	}
	 	else
	 		
	 	{
	 	
	 		System.out.println(x+"the number is odd ");
	 		

	 	}
	 	
		
	}
	
public static void main(String[] args) {
	
	
	Scanner obj1=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=obj1.nextInt();
		int a[]=new int[limit];
		oddevenarraynew obj=new oddevenarraynew();
		System.out.println("enter the numbers");
		 for(int i=0;i<limit;i++)
		 			
		 		{
		 			a[i]=obj1.nextInt();
		 			
		 			
		 		}
		 for(int i=0;i<limit;i++)
			 
		 {
			
		obj.oddeven(a[i]);
				
		 }
		 
}

}
