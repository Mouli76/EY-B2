abstract class A
{
	abstract void abc();
}
abstract class B extends A
{
	void abc()
	{
		System.out.println("Abc method");
	}
	abstract void xyz();
}
class C extends B
{
	void xyz()
	{
		System.out.println("Xyz Method");
	}
}
public class Demo12
{
public static void main(String args[])
{
	C c=new C();
	c.abc();
	c.xyz();
		
}
}