abstract class student
{
	String name;
	int age;
	student(String name,int age){
		this.name = name;
		this.age = age ;
		
	}
	
}


public class AbstructwithConstructor  extends student{
 int rollno;
 int marks;
 AbstructwithConstructor(String n,int a,int r,int m)
 {
	
	 super (n,a);
	 this.rollno= r;
	 this.marks= m;
 }
 public static void main(String[]args)
 {
	 AbstructwithConstructor s = new AbstructwithConstructor("sonal",24,101,81);
	 System.out.println(s.name+""+s.age+""+s.rollno+""+s.marks);
	

 }
	
}
