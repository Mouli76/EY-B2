class A
{
private int id;
private String name;
void setId(int myid)
{
this.id=myid;
}
void setName(String name)
{
this.name=name;
}
int getId()
{
return id;
}
String getName()
{
return name;
}
}
class Demo16
{
public static void main(String args[])
{
A a=new A();
a.setId(500);
a.setName("Mouli");
System.out.println(a.getId());
System.out.println(a.getName());
}
}
