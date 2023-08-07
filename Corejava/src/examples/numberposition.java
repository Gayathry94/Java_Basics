package examples;

import java.util.Scanner;

public class numberposition {
	
	public static void main(String[] args) {
		int f=0;
		int x;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=obj1.nextInt();
		int a[]=new int[limit];
		System.out.println("enter the numbers");
		int i;
	    for(i=0;i<limit;i++)
			
		{
			a[i]=obj1.nextInt();
			
		}
       System.out.println("enter the digit to be searched");
       int s=obj1.nextInt();
       int pos[]=new int[10];
       int y=0;
       for(x=0;x<limit;x++)
      {
    	   if(a[x]==s)
    	   {
    		   
    	pos[y]=x+1;
    		f++;
    		y++;
    	   }
    	   
    	
      }
       
       if(f>0)
       {
    	   System.out.print(s+" is found at "+f+" times and the position are ");
       }
       for(int z=0;z<10;z++)
       {
    	   if(pos[z]!=0)
    	   {
    		   System.out.print(pos[z]+",");
    	   }
    	  
       }
       
       
  
		
		
		
	}

}
