import java.util.Scanner;

abstract class Emp
{
	int id, age , salary;
	String name,desig;
	Emp()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the ID :  ");
		 id=sc.nextInt();

		System.out.print("Enter The name : ");
		 name= sc.next();
		
		System.out.print("Enter the Age  :  ");
		 age=sc.nextInt();		
	}
	public void display()
	{
			System.out.println("===========");
			System.out.println("ID :"+id);
			System.out.println("NAME :"+name);
			System.out.println("AGE :"+age);
			System.out.println("SALARY:"+salary);
			System.out.println("DESIGNATIOn:"+desig);
	}
	abstract void raiseSal();
}
class Dev extends Emp
{
	Dev()
	{
		desig="Developer";
		salary=50000;

	}
	void raiseSal() {
		salary=salary+5000;
		
	} 
		
}
class Clerk  extends Emp
{
	Clerk()
	{
		desig="Clerk";
		salary=25000;
		
	}
	void raiseSal() {
		salary=salary+10000;
		
	}
}
class Tester extends Emp
{
	Tester()
	{
		desig="Tester";
		salary=40000;
		
	}
	void raiseSal() {
		salary=salary+15000;
		
	} 
}
class Manager  extends Emp
{
	
	Manager()
	{
		desig="Manager";
		salary=90000;
		
	}
	void raiseSal() {
		salary=salary+20000;
		
	} 
}
public class Demo17 {

	public static void main(String[] args) {
		int ch1=0;
		int ch2=0;
		Clerk c=null;
		Dev d=null;
		Tester t=null;
		Manager m=null;
		do {
			System.out.println("1 ) CREATE ");
			System.out.println("2 ) DISPLAY ");
			System.out.println("3 ) Raise Salary ");
			System.out.println("4 ) EXIT ");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the CHoice...!");
			 ch1=sc.nextInt();
			 
			 if(ch1==1)
			 {
				 do{
					 	System.out.println("1 ) Clerk ");
					 	System.out.println("2 ) Develpr ");
					 	System.out.println("3 ) Tester ");
					 	System.out.println("4 ) Manager ");
					 	System.out.println("5 ) EXIT ");
					 	System.out.println("Enter the CHoice...!");
					 	ch2=sc.nextInt();
					 	if(ch2==1) {
					 			c = new Clerk();
					 	}
					 	if(ch2==2) {
					 			 d = new Dev();
					 	}
					 	if(ch2==3) {
					 			 t = new Tester();
					 	}
					 	if(ch2==4) {
					 			 m = new Manager();	
					 	}
					 	
				 }while(ch2<=4);
			 }
			 if(ch1==2) {
				 // display
		 			c.display();
		 			d.display();
		 			t.display();
		 			m.display();
			 }
			 if(ch1==3)
			 {
				 // raise the salary
					c.raiseSal();
		 			d.raiseSal();
		 			t.raiseSal();
		 			m.raiseSal();
				 System.out.println("Salary Raised ....!");
			 }
			 if(ch1==4) {
				 System.exit(0);
			 }
		}while(ch1<=4);
	}
}