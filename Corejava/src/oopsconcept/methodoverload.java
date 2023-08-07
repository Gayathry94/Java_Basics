package oopsconcept;

import java.util.Scanner;

public class methodoverload {
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("the sum is"+c);
	}
void add(int a)
{
	int c=0;
	int sum=a+c;
	System.out.println("the sum is "+sum);
}
void add(int a,int b,int c)

{
	int d=a+b+c;
	System.out.println("the sum is "+d);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number1");
	int x=sc.nextInt();
	System.out.println("enter the number2");
	int y=sc.nextInt();
	System.out.println("enter the number3");
	int z=sc.nextInt();
	methodoverload obj1=new methodoverload();
	obj1.add(x,y);
	obj1.add(x);
	obj1.add(x,y,z);
}


}
