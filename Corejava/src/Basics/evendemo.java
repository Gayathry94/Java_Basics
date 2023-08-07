package Basics;

import java.util.Scanner;

public class evendemo {
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the limit");
		int a=obj1.nextInt();
		while(a>0)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			a--;
		}
	}

}
