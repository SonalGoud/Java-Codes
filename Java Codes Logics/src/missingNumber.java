import java.util.ArrayList;

public class missingNumber {
public static void main( String args[])
{
//	ArrayList arr = new ArrayList();
	int n=123, r=0, sum=0;

	while(n%10!=0) {
		r=n%10;
		sum+=r;
		n=n/10;
	}
	System.out.println("sum is :"+sum);
}
	//	int a[] = { 1,2,3,4,5,6,7,10 };
//	int j = a[0];
//	for (int i=0;i<a.length;i++)
//	{
//	    if (j==a[i])
//	    {
//	        j++;
//	        continue;
//	    }
//	    else
//	    {
//	        arr.add(j);
//	        i--;
//	    j++;
//	    }
//	}
//	System.out.println(arr);
//}
}
