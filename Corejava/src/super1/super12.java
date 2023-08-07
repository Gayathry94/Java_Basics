package super1;

public class super12 extends super11
{
	String name="gayathry";
	void show()
	{
		System.out.println(name);
		System.out.println(super.name);
//		invoke superor base class variable
		
	}
	public static void main(String[] args) {
		super12 s=new super12();
		s.show();
		
	}

}
