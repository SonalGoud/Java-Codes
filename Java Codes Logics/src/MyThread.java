
public class MyThread extends Thread
{

	public void run()
	{
		for(int i=0;i<50;i++)
		{
			System.out.println(getName()+"Run:"+i);
		}
	}
	public static void main(String []args)
	{
		MyThread m1= new MyThread();
		m1.start();
		MyThread m2= new MyThread();
		m2.start();
		MyThread m3= new MyThread();
		m3.start();
	}
}
