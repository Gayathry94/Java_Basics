package Basics;

import java.util.Scanner;

public class whiledemo {
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=obj1.nextInt();
		int b=1;
		while(a>=b)
		{
			System.out.println(a);
			a--;
		}
		
	}

}
