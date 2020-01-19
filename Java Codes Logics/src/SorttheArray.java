import java.util.Scanner;

public class SorttheArray {
	
	public static void main(String[]args)
	{
		int n;
		int temp;
		Scanner s= new Scanner (System.in);
		System.out.println("enter the array size");
		n= s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the value");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
        for(int i=0;i<n;i++)
        {
        	System.out.println(a[i]);
        }
	}
}
