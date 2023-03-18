package WAP;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		 int n;double res=0;
			
		  Scanner sc=new Scanner(System.in);
	 
		  System.out.println("enter how many numbers to cal  avg");
		   
	          n=sc.nextInt();
	 
		  int a[]=new int[n];
	 
		  System.out.println("enter   "+n+"  numbers");
	    	       
	          for(int i=0;i<n;i++)
	 	       a[i]=sc.nextInt();
	          System.out.println(Arrays.toString(a));
	 
		  res=Average.CalAvg(a,n); 
	 	 	    
	  	  System.out.println("average="+res/n);
	}
	
	  static double CalAvg(int  a[],int n)
      {
	   double res=0;

	   for(int i=0;i<n;i++)
	       res =res+a[i];

	   return res;
      }
}
