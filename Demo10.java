class A
{
	public void abc()
	{
	System.out. println("A class method");
	}
}
class B extends A
{
	public void abc()
	{
	System.out. println("B class method");
	}
}

public class Demo10
{
public static void main(String args[])
{
	B b =new B();
	b.abc();
		
}
}