package interface1;

public class adder implements operations {
	public void add(int x,int y) 
	{
	int c=x+y;
	System.out.println("The sum is "+c);
	}

	@Override
	public void sub(int x, int y) {
		
		int c=x-y;
		System.out.println("The sub is "+c);
	}
	

	@Override
	public void div(int x, int y) {
		int c=x/y;
		System.out.println("The div is "+c);
	}

	@Override
	public void mul(int x, int y) {
		
		int c=x*y;
		System.out.println("The mul is "+c);
	}

	@Override
	public void view(int x, int y) {
		System.out.println(x);
		System.out.println(y);
		
	}
}
