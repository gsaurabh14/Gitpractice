package WAP;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		Factorial fobj = new Factorial();
		int fact = fobj.factorial(num);
		
		System.out.println("factorial of"+num+" = "+fact);
		
	
	}
	
 int factorial(int n) {
	 int fact=1;
	 int seq;
	for(seq=2;seq<=n;seq++)
	 fact *= seq;
 
 return fact;
}
}
