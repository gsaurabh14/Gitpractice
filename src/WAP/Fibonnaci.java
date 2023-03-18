package WAP;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		fibona(num);
		sc.close();
	}
	
	static void fibona(int n){
		int x=1, y=0,z=0, count=1;
		while(count<=n) {
			System.out.println(z+" ");
			z=x+y;
			x=y;
			y=z;
			count++;
		}
		
	}

}
