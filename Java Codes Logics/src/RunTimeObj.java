import java.util.Scanner;

public class RunTimeObj {
	public int add()
	{
		int a=10,b=50;
		int c= a+b;
		System.out.println(c);
		return 0;
	}
	

}
 class Student {
	public int sub()
	{
		int a=10,b=50;
		int c= a-b;
		System.out.println(c);
		return 0;
	}
	

}
 class Employee {
		public int multiply()
		{
			int a=10,b=50;
			int c= a*b;
			System.out.println(c);
			return 0;
		}
		

	}
 
 
 class Test {
	 
	 Scanner s= new Scanner (System.in);
	 System.out.println("enter the class name");
	 
	 String n= s.nextLine();
		
	 public static void main(String[]args)
	 {
		 
		 Object obj= Class.forName(arg[n]).new Instance();
		 System.out.println("realted for"+obj.getClass().getName());
	
	 }
	 
	 
	 
	 
		

	}
 
 