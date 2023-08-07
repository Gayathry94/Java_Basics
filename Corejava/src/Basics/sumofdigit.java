package Basics;
import java.util.Scanner;
public class sumofdigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the number");
	int a=sc.nextInt();
	int rem=0,sum=0;
	while(a>0)
	{
		rem=a%10;
	    sum=sum+rem;
	    a=a/10;
	}
	System.out.println("the sum of digit is "+sum);
}
}
