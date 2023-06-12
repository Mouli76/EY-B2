abstract class Bank
{
abstract void loan();
abstract void account();
}
class Sbi extends Bank
{
void loan()
{
System.out.println("Edu");
}
void account()
{}
}
class Axis extends Bank
{
void loan()
{
System.out.println("edu + personal");
}
void account()
{}}
class Demo13
{
public static void main(String args[])
{
Sbi s=new Sbi();
s.loan();
Axis a=new Axis();
a.loan();
}
}