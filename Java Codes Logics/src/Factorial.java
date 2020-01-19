
public class Factorial {
	public static void main(String []args) {
		int n1=0,n2=1,n3=0;
		while(n3<10) {
			
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
		
	}
	 
}
