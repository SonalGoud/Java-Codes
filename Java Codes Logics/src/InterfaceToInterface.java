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
interface c extends java,php{
	 
	 public void m1();
}



public class InterfaceToInterface  implements c {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
