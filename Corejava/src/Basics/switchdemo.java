package Basics;

import java.util.Scanner;

public class switchdemo {
public static void main(String[] args) {
	Scanner obj1=new Scanner(System.in);
	System.out.println("Enter the digit");
	int x=obj1.nextInt();
	switch (x) {
	case 0:
		System.out.println("zero");
		break;
	case 1:
		System.out.println("One");
		break;
	case 2:
		System.out.println("Two");
		break;
	case 3:
		System.out.println("Three");
		break;
	case 4:
		System.out.println("Four");
		break;
	case 5:
		System.out.println("five");
		break;
	case 6:
		System.out.println("six");
		break;
	case 7:
		System.out.println("seven");
		break;
	case 8:
		System.out.println("Eight");
		break;
	case 9:
		System.out.println("Nine");
		break;
		
	default:
		System.out.println("Not a valid number");
		break;
	}
	
	
	
	
}
}
