package oopsconcept;

import java.util.Scanner;

public class constructordemo {
	
	public constructordemo(int x,int y)
	{
		int c=x+y;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int x=sc.nextInt();
		System.out.println("enter the number2");
		int y=sc.nextInt();
		constructordemo obj=new constructordemo(x,y);
		
		
	}

}
