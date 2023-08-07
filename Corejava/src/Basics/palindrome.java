package Basics;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		int rev=0,rem;
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=obj1.nextInt();
		int temp=a;
		while(a>0)
		{
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		}
		if(temp==rev)
		System.out.println("the "+rev+" is palindrome");
		else
		System.out.println("the "+rev+" is not palindrome ");
		
	
	}

}
