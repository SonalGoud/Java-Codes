import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javafx.print.Collation;

public class SortusingArrayList {
	


public static void main(String[]args)
{
	int a[]= {1,2,3,1,2,4,6,4};
	ArrayList al= new ArrayList();
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				al.add(a[i]);
			}
		}
	}
	

}

	

}