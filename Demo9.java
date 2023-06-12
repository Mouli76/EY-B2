class Emp
{
	void abc()
	{
	System.out. println("Hi abc()");
	}
	void abc(int a)
	{
	System.out. println("Hi abc(int a): "+a);
	}
	void abc(int a, int b)
	{
	System.out. println("Hi abc(int a, int b): " + (a+b));
	}
}

public class Demo9
{
public static void main(String args[])
{
	Emp e=new Emp();
	e.abc();
	e.abc(100);
	e.abc(100, 200);	
}
}