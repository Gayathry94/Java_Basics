package examples;
import java.util.Scanner;

public class characterarray {
	
public static void main(String[] args) {

	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=sc.nextInt();
		System.out.println("enter the string");
		String val=sc.next();
		characterarray a1=new characterarray();
		char[] array1 = val.toCharArray();
		
		
		for(int i=0;i<array1.length;i++)
 		{
			a1.checkVowel(array1[i]);
 		}
		
		
}
void checkVowel(char s)
{
	switch(s)
	{
	case 'a':
		System.out.println("vowel-a is found");
		break;
	case 'e':
		System.out.println("vowel-e is found");
		break;
	case 'i':
		System.out.println("vowel-i is found");
		break;
	case 'o':
		System.out.println("vowel-o is found");
		break;
	case 'u':
		System.out.println("vowel-u is found");
		break;
	default:
		System.out.println("consonat letters found");
		break;
		
		
	}
}
}
