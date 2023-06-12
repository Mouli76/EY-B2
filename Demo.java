import java.util.Scanner;
class A
{
A()
{
Scanner sc=new Scanner(System.in);


System.out. println("Enter ID: ");
int id=sc.nextInt();
sc.nextLine();

System.out. println("Enter Name: ");
String name=sc.nextLine();

System.out. println("ID is : "+id);
System.out. println("Name is : "+name);

}
}

public class Demo
{
public static void main(String args[])
{
A a=new A();
}}