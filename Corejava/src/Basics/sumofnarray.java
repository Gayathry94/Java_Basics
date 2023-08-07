package Basics;

import java.util.Scanner;

public class sumofnarray {
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=obj1.nextInt();
		int a[]=new int[limit];
		System.out.println("enter "+limit+" values");
		int sum=0;
		for(int x=0;x<limit;x++)
			
		{
			a[x]=obj1.nextInt();
			
		}
		
		for(int y=0;y<limit;y++)
		{
			sum=sum+a[y];
		}
		System.out.println("the sum of array is "+sum);
	}

}
