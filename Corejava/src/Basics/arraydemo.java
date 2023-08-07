package Basics;

import java.util.Scanner;

public class arraydemo {
	
	public static void main(String[] args) {
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=obj1.nextInt();
		int a[]=new int[limit];
		System.out.println("enter "+limit+" values");
		
		for(int x=0;x<limit;x++)
			
		{
			a[x]=obj1.nextInt();
		}
		System.out.println("The values are ");
		for(int i=0;i<limit;i++)
		{
			
			System.out.println(a[i]);
		}
		
		
	}

}
