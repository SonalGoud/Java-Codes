import java.util.ArrayList;
import java.util.List;

public  class Test {
		
	
		public void foo() {
			try {
				throw new RuntimeException();
			}finally {
				System.out.println("in Finally Block");
			}
			
		}	
		
	
	public static void main(String a[])
	{
		try {
		Test t = new Test();
		t.foo();
		System.out.println("Fineshed runin");
		}catch (Exception e) {
			
		}
	}
	}

	
