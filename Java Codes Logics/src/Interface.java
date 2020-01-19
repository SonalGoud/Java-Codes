
 interface book{
	 public void m1();
	
}
 interface java
 {
	 public void m1();
	 
	 
      public void m2();
    
 }
 interface php{
	 
	 public void m1();
 }
interface python{
	 
	 public void m1();
 }
interface c{
	 
	 public void m1();
}

public class Interface implements book,c,java,php,python {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	
		int a = 10;
		int b=20;
		int c= a+b;
		System.out.println(c);
		
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		int a = 10;
		int b=20;
		int c= a-b;
		System.out.println(c);
		
	}
	public static void main(String[]args)
	{
		Interface n = new Interface ();
		n.m1();
		n.m2();
		
		
		
	}

	
	
	
	

}
