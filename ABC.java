/*class ABC extends Thread
{
 System.out.println("Git modified");
	public void run()
	{
		for (int i=0;i<=10;i++)
		{
			System.out.println("Thread 1 "+i);
		}
	}
	public static void main(String[] args)
	{
		ABC t1=new ABC();
		t1.start();

	}
}*/
class ABC extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)
	{
		ABC t1=new ABC();
		t1.start();
	}
}
