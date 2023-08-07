package Encaps;

import java.util.Scanner;

public class methodoverridedemo1 {
	void add(int x,int y)
	{
		int c=x+y;
		System.out.println("the sum is "+c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int x=sc.nextInt();
		System.out.println("enter the number2");
		int y=sc.nextInt();
		methodoverridedemo1 obj1=new methodoverridedemo1();
		obj1.add(x,y);
		
	}

}
