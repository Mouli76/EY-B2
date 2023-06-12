class A
{
	String name="A";
}
class B extends A
{
String name="B";

public void display(String name)
{
	System.out.println("Hi "+name);
	System.out.println("Hi "+this.name);
	System.out.println("Hi "+super.name);
}
}

public class Demo7
{
public static void main(String args[])
{
B b= new B();
b.display("Mouli");
}
}