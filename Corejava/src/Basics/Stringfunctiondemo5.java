package Basics;

import java.util.Scanner;

public class Stringfunctiondemo5 {

	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the name");
		String name1=obj1.next();
		if(name1.isEmpty())
		{
			System.out.println("the entered string is null");
		}
		else 
		{
			System.out.println("the entered string is "+name1);

		}
	}
}
