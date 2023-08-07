package exception;

import java.util.Scanner;

public class trycatch {
	void div(int x,int y)
	{
		try 
		{
			System.out.println(x/y);
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int x=sc.nextInt();
		System.out.println("enter the number2");
		int y=sc.nextInt();
		trycatch obj1=new trycatch();
		obj1.div(x,y);
		
	}

}
