package Basics;

import java.util.Scanner;

public class Stringfunctiondemo1 {
	public static void main(String[] args) {

		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the name1");
		String name1=obj1.next();
		System.out.println("Enter the name2");
		String name2=obj1.next();
		String ch=name1.concat(name2);
		System.out.println("the concat string is "+ch);

		}


}
