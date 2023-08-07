package Basics;

public class paramdemo {
	
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		int a=100;
		int b=10;
		paramdemo obj1=new paramdemo();
		obj1.add(a,b);
	}

}
