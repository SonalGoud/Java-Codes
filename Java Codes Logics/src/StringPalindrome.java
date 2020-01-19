
public class StringPalindrome {
	 public static void main(String[]args)
	 {
		 String s= "nitin";
		 String  s1="";
		 for(int i=s.length()-1; i>=0;i--)
		 {
			 s1+= s.charAt(i);
		 }
			 if(s.equals(s1))
			 {
				 System.out.println("is palindrome");
			 }
			 else {
				 System.out.println(" not palindrome");
			 }
	 }

}
