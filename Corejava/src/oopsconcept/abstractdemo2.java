package oopsconcept;

import java.util.Scanner;

public class abstractdemo2 extends abstractdemo
{
	void add(int x,int y)
	{
		int c=x+y;
		System.out.println("sum= "+c);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number1");
	int x=sc.nextInt();
	System.out.println("enter the number2");
	int y=sc.nextInt();
	
	abstractdemo2 obj1=new abstractdemo2();
	obj1.add(x, y);
	obj1.show();
	
	
}
}
