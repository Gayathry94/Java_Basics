package Basics;

import java.util.Scanner;

public class Stringfunctiondemo9 {

		public static void main(String[] args) {
			Scanner obj1=new Scanner(System.in);
			System.out.println("Enter the name");
			String name1=obj1.next();
			System.out.println("the character in uppercase is "+name1.toUpperCase()+" and the character in lowercase is "+name1.toLowerCase());
		}

}
