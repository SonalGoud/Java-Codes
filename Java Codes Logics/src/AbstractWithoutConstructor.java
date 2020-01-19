abstract class person{
	String name;
	int age;
	
	
}


public class AbstractWithoutConstructor  extends person{
 int rollno;
 int marks;
 AbstractWithoutConstructor(String n,int a,int r,int m)
 {
	
	 this.name= n;
	 this.age= a;
	 this.rollno= r;
	 this.marks= m;
 }
 public static void main(String[]args)
 {
	 AbstractWithoutConstructor s = new AbstractWithoutConstructor("sonal",24,101,81);
	 System.out.println(s.name+""+s.age+""+s.rollno+""+s.marks);
	

 }
	
}
