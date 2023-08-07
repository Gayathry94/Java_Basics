package examples;

import java.util.Scanner;

public class sumaveragearray {
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=obj1.nextInt();
		int a[]=new int[limit];
		System.out.println("enter the numbers");
		int i;
		int sum=0;
		int avg;
	    for(i=0;i<limit;i++)
			
		{
			a[i]=obj1.nextInt();
			
		}
		for(int y=0;y<limit;y++)
		{
			sum=sum+a[y];
		}
		avg=sum/limit;

		System.out.println("the sum is "+sum);
		System.out.println("the average is "+avg);

	}

}
