class Car extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			try {
				if(Thread.currentThread().getName().equals("THAR"))
				{
					System.out.println(" 		"+Thread.currentThread().getName()+" :"+i);
					sleep(1000);
				}
				if(Thread.currentThread().getName().equals("BMW"))
				{
					System.out.println(" 				"+Thread.currentThread().getName()+" :"+i);
					sleep(1000);
				}
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class Demo18 {

	public static void main(String[] args) {
		Car c=new Car();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		t1.setName("THAR");
		t2.setName("BMW");
		
		for(int k=0;k<20;k++)
		{
			try {
				System.out.println("AUDI :"+k);
				Thread.sleep(1000);
				if(k==5)
				{
					System.out.println("THAR going for a break");
					t1.suspend();
				}
				if(k==10)
				{
					System.out.println("THAR just came back");
					t1.resume();
				}
				if(k==15)
				{
					System.out.println("BMW got burst");
					t2.stop();
				}
			}
			catch(Exception e)
			{
				
			}
		}

	}

}
