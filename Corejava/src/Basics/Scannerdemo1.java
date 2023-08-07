package Basics;
import java.util.Scanner;
public class Scannerdemo1 {
void add(int a,int b)
{
int c=a+b;
System.out.println("The sum is "+c);
}
void sub(int a,int b)
{
int c=a-b;
System.out.println("The subtraction is "+c);
}
void mul(int a,int b)
{
int c=a*b;
System.out.println("The multiply is "+c);
}
void div(int a,int b)
{
int c=a/b;
System.out.println("The division is "+c);
}

public static void main(String[] args) {
Scanner obj1=new Scanner(System.in);
//object of the scanner clss is created
System.out.println("Enter first number");
//value from the keyboard is stored
int x=obj1.nextInt();
System.out.println("Enter second number");
int y=obj1.nextInt();
//object for the base class is created
Scannerdemo1 obj2=new Scannerdemo1();
//calling each methods                    
obj2.add(x,y);
obj2.sub(x,y);
obj2.mul(x,y);
obj2.div(x,y);



}
}
