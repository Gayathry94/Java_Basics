package Basics;

public class Thisdemo {
	int b=45;
	void add(int a,int b)
	{
		System.out.println(a+b);
		int c=this.b;
		System.out.println(a+c);
		
		
		
	}
	public static void main(String[] args) {
		
		Thisdemo obj1=new Thisdemo();
		obj1.add(10,20);
	}

}
