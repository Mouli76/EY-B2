class Parent
{
int site =7;
String car="Benz";
int money =500000;
void pdata()
{

System.out. println("P Site : "+site);
System.out. println("P Car : "+car);
System.out. println("P Money : "+money);

}
}
class Child extends Parent
{
int money =200000;
void pdata()
{
System.out. println("=================");
System.out. println("P Site : "+site);
System.out. println("P Car : "+car);
System.out. println("C Money : "+money);

}
}

public class Demo4
{
public static void main(String args[])
{
Parent p=new Parent();
p.pdata();
Child c=new Child();
c.pdata();

}}