package WAP;

import java.util.Scanner;

public class vol {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("enter the value");
	double rad = sc.nextDouble();
	System.out.println("enter the value");	
	double height = sc.nextDouble();
		vol a = new vol();
	double answer = a.voulme(rad, height);
	System.out.println("Volume of the cone is"+" "+ answer);
		
	}

	double voulme(double r, double h)
	{
		double res = (r*r*h*22)/(7*3) ;
				
				return res;
	}
}
