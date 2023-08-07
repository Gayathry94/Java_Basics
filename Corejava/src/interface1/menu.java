package interface1;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		
		adder o1=new adder();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("......Enter 1 for Add.........");
		System.out.println("......Enter 2 for Subtract......");
		System.out.println("......Enter 3 for multiplication......");
		System.out.println("......Enter 4 for Division......");
		System.out.println("......Enter 5 for view........");
		int c=sc.nextInt();
		if(c<=6) 
		{
			
		
		System.out.println("enter first number");
		int x=sc.nextInt();
		System.out.println("enter second number");
		int y=sc.nextInt();
		switch(c) 
		{
		case 1:
			o1.add(x,y);
			break;
		case 2:
			o1.sub(x,y);
			break;
		case 3:
			o1.mul(x,y);
			break;
		case 4:
			o1.div(x,y);
			break;
		case 5:
			o1.view(x,y);
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
