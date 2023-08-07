package Basics;

public class VAriabletype {
	int c1=1000;
	void rt()
	{
		c1=100;
	}
	void fg()
	{
		System.out.println(c1);
	}
	public static void main(String[] args) {
		
		VAriabletype f=new VAriabletype();
		f.fg();
		f.rt();
		f.fg();
	}

}