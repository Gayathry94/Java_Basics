package Basics;

public class Variblelocal {
//	this is global variable
	 int d=100;
	void ab()
	{
//		this is local variable
		int a=10;
		System.out.println(a);
	}
	void cd()
	{
		int c=67;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Variblelocal obj1=new Variblelocal();
		Variablelocal2 obj2=new Variablelocal2();
		obj1.ab();
		obj1.cd();
		obj2.xyz();
//		accessing global variable from another class 
		int y=obj2.x;
		System.out.println("the value of x is "+y);
		
		
	}

}
