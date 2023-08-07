package Basics;

import java.util.Scanner;

public class staticfunctiondemo1 {
		static void sub(int a,int b)
	{
			
			int c=a-b;
			System.out.println("the sub answer is "+c);
	}
	
	
	public static void main(String[] args) {
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=obj1.nextInt();
		System.out.println("Enter the second number");
		int b=obj1.nextInt();
		
		staticfunctiondemo1.sub(a,b);
		staticfunctiondemo2.add(a,b);
		
	
	}

}
