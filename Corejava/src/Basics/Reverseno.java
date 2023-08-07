package Basics;

import java.util.Scanner;

public class Reverseno {
 public static void main(String[] args) {
	int rev=0,rem;
	Scanner obj1=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=obj1.nextInt();
	while(a>0)
	{
	rem=a%10;
	rev=rev*10+rem;
	a=a/10;
	
	}
	System.out.println(rev);
}
}
