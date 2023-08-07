package examples;
import java.util.Scanner;

public class reversearray {
public static void main(String[] args) {
	int counter;
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("How many elements you want to enter: ");
	counter = scanner.nextInt();
	int number[] = new int[counter];

	for(int i=0; i<counter; i++)
	{
	    System.out.print("Enter Array Element"+(i+1)+": ");
	    number[i] = scanner.nextInt();
	}
	System.out.println("the reversed elements are");
	for(int ij=number.length-1;ij>=0;ij--)
	{
		System.out.println(number[ij]+" ");
	}
	
}
}
