package Basics;

import java.util.Scanner;

public class returndemo {
	int add(int x,int y)
	{
		int c=x+y;
		return c;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number1");
	int x=sc.nextInt();
	System.out.println("enter the number2");
	int y=sc.nextInt();
	returndemo a=new returndemo();
	
	System.out.println("the sum is "+a.add(x, y));
	
}
	

}
