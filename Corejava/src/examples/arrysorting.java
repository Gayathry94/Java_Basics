package examples;
import java.util.Scanner;
public class arrysorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=sc.nextInt();
		int a[]=new int[limit];
		int i,temp=0;
		System.out.println("enter the numbers");
 		for(i=0;i<limit;i++)
 		{
 			a[i]=sc.nextInt();
 		}
 		System.out.println("The elements before sorting");
 		for(i=0;i<limit;i++)
 		{
 			System.out.println(a[i]);
 		}
 		for(i=0;i<limit;i++)
 		{
 			for(int j=i+1;j<limit;j++)
 			{
 				if(a[i]>a[j])
 				{
 					temp=a[i];
 					a[i]=a[j];
 					a[j]=temp;
 				}
 			}
 		}
 		System.out.println("Array after sorting is");
 		for(int x=0;x<limit;x++)
 		{
 			System.out.println(a[x]);
 		}
	}

}
