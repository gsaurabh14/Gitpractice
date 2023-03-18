package WAP;

import java.util.Arrays;
import java.util.Scanner;

public class uniquenumber {

	public static void main(String[] args) {
		
		System.out.println("enter the length");
		int a [] = {1,3,2,5,2,1,7};
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]==a[i])
				count++;
		}
		if(count==1)
		System.out.println(a[i]);
	}

	}
}
