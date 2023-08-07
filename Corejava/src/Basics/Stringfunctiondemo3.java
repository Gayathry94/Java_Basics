package Basics;

import java.util.Scanner;

public class Stringfunctiondemo3 {
public static void main(String[] args) {

	Scanner obj1=new Scanner(System.in);
	System.out.println("Enter the name1");
	String name1=obj1.next();
	System.out.println("Enter the name2");
	String name2=obj1.next();
	System.out.println(name1.equals(name2));
}
	
}
