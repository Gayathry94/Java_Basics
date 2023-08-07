package Basics;

import java.util.Scanner;
public class Scannerdemo2 {

public static void main(String[] args) {
Scanner obj1=new Scanner(System.in);
System.out.println("Enter the name");
String x=obj1.next();
System.out.println("Enter the Date of Birth");
int y=obj1.nextInt();
System.out.println("Enter the sex");
String z=obj1.next();
System.out.println("Enter the address");
String u=obj1.next();
System.out.println("The name is "+x);
System.out.println("The DOB is "+y);
System.out.println("The sex is "+z);
System.out.println("The Address is "+u);

}

}