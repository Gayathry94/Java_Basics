package oopsconcept;

import java.util.Scanner;

public class construct2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int x=sc.nextInt();
		System.out.println("enter the number2");
		int y=sc.nextInt();
		construct1 x1=new construct1(x,y);
	}

}
