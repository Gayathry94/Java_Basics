package Basics;

import java.util.Scanner;

public class ifdemo {
	void greater(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		else
		{
			System.out.println(b+" is greater");
		}
	}
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=obj1.nextInt();
		System.out.println("Enter the second number");
		int b=obj1.nextInt();
		ifdemo obj2=new ifdemo();
		obj2.greater(a,b);
		
		
		
	}

}
