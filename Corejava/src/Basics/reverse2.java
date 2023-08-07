package Basics;
import java.util.Scanner;
public class reverse2 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc1.nextInt();
		reverse2 obj1=new reverse2();
		obj1.rever(a);
		
		
		
	}
	
	void rever(int x) {
		int rev=0,rema;
		while(x>0)
		{
			rema=x%10;
			rev=rev*10+rema;
			x=x/10;
			
		}
		System.out.println("the reversed number is "+rev);
	}
}
