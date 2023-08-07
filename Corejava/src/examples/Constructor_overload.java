package examples;
import java.util.Scanner;

import oopsconcept.construct1;
public class Constructor_overload {
	public Constructor_overload(int a,int b)
	{
		int c=a+b;
		System.out.println("2 argument sum is: "+c);
	}
	public Constructor_overload(int a)
	{
		int b=10;
		int c=a+b;
		System.out.println("1 argument sum is: "+c);
	}
	public Constructor_overload(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("3 argument sum is: "+c);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int a=sc.nextInt();
		System.out.println("enter the number2");
		int b=sc.nextInt();
		System.out.println("enter the number3");
		int c=sc.nextInt();
		Constructor_overload x1=new Constructor_overload(a,b);
		Constructor_overload x2=new Constructor_overload(a);
		Constructor_overload x3=new Constructor_overload(a,b,c);
	}

}
