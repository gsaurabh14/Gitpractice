package WAP;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Prime.primeno(n);
		
		sc.close();
	}
	static void primeno(int x){
		int res = 0;
		for(int i=2;i<x;i++){
		if(x%i==0){
			res++;
		}
		
		if(res==2)
			System.out.println("its a prime number");
		else
			System.out.println("not a prime number");
		
	}
	}
}
