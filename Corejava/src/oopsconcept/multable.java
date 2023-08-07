package oopsconcept;

import java.util.Scanner;

public class multable {
	void add(int rem)
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println(rem+" * "+i+" ="+rem*i);
		}
	}
	

	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=obj1.nextInt();
		multable m1=new multable();
		int rev=0;
		int rem;
		while(a>0)
		{
			
					
	     rem=a%10;
	rev=rev*10+rem;
	     a=a/10;
	
		}
		
		while(rev>0)
		{
					
	     rem=rev%10;
	     m1.add(rem);
	     rev=rev/10;
	
		}
		
		}
}
