package Basics;

import java.util.Scanner;
public class Scannerdemo {

public static void main(String[] args) {
Scanner obj1=new Scanner(System.in);
System.out.println("Enter first number");
int a=obj1.nextInt();
System.out.println("Enter second number");
double b=obj1.nextDouble();
double c=a+b;
System.out.println("The result is "+c);
}
}