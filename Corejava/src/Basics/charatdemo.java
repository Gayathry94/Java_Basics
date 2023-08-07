package Basics;
import java.util.Scanner;


public class charatdemo {
	
	public static void main(String[] args) {

		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=obj1.next();
		char ch=name.charAt(1);
		System.out.println("the character at second position is "+ch);

		}

}
