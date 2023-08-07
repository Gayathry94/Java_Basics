package examples;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
 		System.out.println("enter the limit");
 		int limit=sc.nextInt();
 		for(int i=1;i<=limit;i++)
 		{
 			sum=sum+i;
 		}
 		
		System.out.println("the sum is "+sum);
	}
}
