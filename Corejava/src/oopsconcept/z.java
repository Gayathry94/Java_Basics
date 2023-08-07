package oopsconcept;

import java.util.Scanner;

public class z extends y {
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int x=sc.nextInt();
		System.out.println("enter the number2");
		int y=sc.nextInt();
		z obj1=new z();
		obj1.add(x,y);
		obj1.sub(x,y);
		}
}
