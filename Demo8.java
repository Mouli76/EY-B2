class Emp
{
	Emp()
	{
	this(100);
	System.out. println("Hi Employee");
	}
	Emp(int id)
	{
	this(100,"Mouli");
	System.out. println("Hi Employee with id: "+id);
	}
	Emp(int id, String name)
	{
	this(100, 22, "Mouli");
	System.out. println("Hi Employee with id and name: "+id+", "+name);
	}
	Emp(int id, int age, String name)
	{
	System.out. println("Hi Employee with id, age and name: "+id+", "+age+", "+name);
	}
}

public class Demo8
{
public static void main(String args[])
{
	Emp e=new Emp();
	//Emp e1= new Emp(100);
	//Emp e2= new Emp(100, "Mouli");
	//Emp e3= new Emp(100, 22, "Mouli");	
}
}