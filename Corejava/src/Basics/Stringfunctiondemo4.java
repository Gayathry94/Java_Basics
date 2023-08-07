package Basics;

import java.util.Scanner;

public class Stringfunctiondemo4 {
public static void main(String[] args) {
	Scanner obj1=new Scanner(System.in);
	System.out.println("Enter the name");
	String name1=obj1.next();
	int a=name1.indexOf("");
	System.out.println("the character at the specified index is "+a);
}
}
