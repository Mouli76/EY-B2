import java.util.Scanner;
class Emp
{

int id, age;
double sal;
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

System.out. println("Enter Salary: ");
sal=sc.nextInt();

sc.nextLine();
System.out. println("Enter Designation: ");
des=sc.nextLine();
}
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

public class Demo2
{
public static void main(String args[])
{
Emp e=new Emp();
e.display();
}}