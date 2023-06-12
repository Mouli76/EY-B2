import java.util.Scanner;
class Emp
{
int id, age,sal;
String name, des;
Emp()
{
Scanner sc=new Scanner(System.in);

System.out. println("Enter ID: ");
id=sc.nextInt();
sc.nextLine();
System.out. println("Enter Name: ");
name=sc.nextLine();
System.out. println("Enter Age: ");
age=sc.nextInt();
}
}
class Dev extends Emp
{
int sal=25000;
String des="Developer";
Dev()
{}
public void display()
{
System.out. println("===================");
System.out. println("ID is : "+id);
System.out. println("Name is : "+name);
System.out. println("Age is : "+age);
System.out. println("Salary is : "+sal);
System.out. println("Designation is : "+des);
}
}
class Clerk extends Emp
{
int sal=35000;
String des="Clerk";
Clerk()
{}
public void display()
{
System.out. println("===================");
System.out. println("ID is : "+id);
System.out. println("Name is : "+name);
System.out. println("Age is : "+age);
System.out. println("Salary is : "+sal);
System.out. println("Designation is : "+des);
}
}
class Tester extends Emp
{
int sal=45000;
String des="Tester";
Tester()
{}
public void display()
{
System.out. println("===================");
System.out. println("ID is : "+id);
System.out. println("Name is : "+name);
System.out. println("Age is : "+age);
System.out. println("Salary is : "+sal);
System.out. println("Designation is : "+des);
}
}
class Manager extends Emp
{
int sal=55000;
String des="Manager";
Manager()
{}
public void display()
{
System.out. println("===================");
System.out. println("ID is : "+id);
System.out. println("Name is : "+name);
System.out. println("Age is : "+age);
System.out. println("Salary is : "+sal);
System.out. println("Designation is : "+des);
}
}
public class Demo6
{
public static void main(String args[])
{
System.out.println("1.Developer");
System.out.println("2.Clerk");
System.out.println("3.Tester");
System.out.println("4.Manager");
System.out.print("Select your Designation : ");
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
if (n==1){
Dev d=new Dev();
System.out. println("===DEVELOPER===");
d.display();
}
if (n==2){
Clerk c=new Clerk();
System.out. println("===CLERK===");
c.display();
}
if (n==3){
Tester t=new Tester();
System.out. println("===TESTER===");
t.display();
}
if (n==4){
Manager m=new Manager();
System.out. println("===MANAGER===");
m.display();
}
}}