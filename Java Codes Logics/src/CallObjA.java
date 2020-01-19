 class CallObjA {
	CallObjA()
	{
	System.out.println("class a");	
	}

}
 class CallObjChild extends CallObjA{
	 
		 
		 CallObjChild()
		 {
			 System.out.println("class b");
		 }
		 
		 public static void main(String[]args)
		 {
			 CallObjChild n= new CallObjChild();
				
		 }
	 }
	
	
	
