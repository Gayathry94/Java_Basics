package oopsconcept;

import java.util.Scanner;

public class menudriven {
	public void add(int x,int y) 
	{
	int c=x+y;
	System.out.println("The sum is "+c);
	}
	public void sub(int x,int y) 
	{
	int c=x-y;
	System.out.println("The sub is "+c);
	}
	public void mul(int x,int y) 
	{
	int c=x*y;
	System.out.println("The multiplied is "+c);
	}
	
	public void div(int x,int y) 
	{
	int c=x/y;
	System.out.println("The division is "+c);
	}
	public void view(int x,int y)
	{
		System.out.println("The first Number is "+x);
		System.out.println("The second Number is "+y);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("......Enter 1 for Add.........");
		System.out.println("......Enter 2 for Subtract......");
		System.out.println("......Enter 3 for multiplication......");
		System.out.println("......Enter 4 for Division......");
		System.out.println("......Enter 5 for view........");
		int c=sc.nextInt();
		
		menudriven obj1=new menudriven();
		if(c<=5) {
			
		
			System.out.println("enter the first number");
			int x=sc.nextInt();
			System.out.println("enter the second number");
			int y=sc.nextInt();	
		
		switch(c) 
			{
			case 1:
				obj1.add(x,y);
				break;
			case 2:
				obj1.sub(x,y);
				break;
			case 3:
				obj1.mul(x,y);
				break;
			case 4:
				obj1.div(x,y);
				break;
			case 5:
				obj1.view(x,y);
				break;
			
			default:
				System.out.println("Not a valid number");
				break;
				
		
			}
		
		}
		else
		{
			System.out.println("Not a valid number");
		}
	}

}
