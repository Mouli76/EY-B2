interface I
{
int a=10;
int b=20;
abstract void add();
abstract void sub();
}
interface J
{
int c=30;
int d=40;
abstract void mul();
abstract void div();
}
interface K extends I,J
{
}
class Cal implements K
{
public void add()
{
System.out.println(a+b);
}
public void sub()
{
System.out.println(a-b);
}
public void mul()
{
System.out.println(a*b);
}
public void div()
{
System.out.println(a/b);
}
}
class Demo15
{
public static void main(String args[])
{
Cal c=new Cal();
System.out.println("===== I interface =====");
I i=c;
i.add();
i.sub();

System.out.println("===== J interface =====");
J j=c;
j.mul();
j.div();

System.out.println("===== K interface =====");
K k=c;
k.add();
k.sub();
k.mul();
k.div();
System.out.println("=======Cal class =======");	

c.add();
c.sub();
c.mul();
c.div();
	
}
}
