package oopsconcept;
import java.util.Scanner;
public class b extends a
{
public static void main(String[] args) {
	

Scanner sc=new Scanner(System.in);
System.out.println("enter the number1");
int x=sc.nextInt();
System.out.println("enter the number2");
int y=sc.nextInt();
b obj1=new b();
obj1.add(x,y);


}

}
