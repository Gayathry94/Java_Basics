package examples;
import java.util.Scanner;
public class array {
	static int pallindrome[]=new int[10];
	static int notpallindrome[]=new int[10];
	int i=0;
	int j=0;
	public void pallindrome(int x)
	{
		int rem,rev=0;
		 int value=x;
		 while(x>0)
		 {
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
	
		 }
		 
		 
		if(value==rev)
		{
		pallindrome[i]=rev;
		i++;
		}
		else
		{
			notpallindrome[j]=rev;
			j++;
		}
	}
	
	public static void main(String[] args) 
	{
		array a1=new array();
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
 		
 		for(i=0;i<limit;i++)
 		{
 			a1.pallindrome(a[i]);
 		}
 		System.out.println("The palindrome numbers are ");
 		for(int c=0;c<10;c++)
 		{
 			if(pallindrome[c]!=0)
 			{
 				System.out.println(pallindrome[c]+" ");
 			}
 			
 		}
 		
 		System.out.println("The other numbers are ");
 		for(int z=0;z<10;z++)
 		{
 			if(notpallindrome[z]!=0)
 			{
 				System.out.print(notpallindrome[z]+" ");	
 			}
 			
 		}

	}
	

}
