package WAP;

import java.util.Scanner;

public class Elec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total kw used");
		int kw = sc.nextInt();
		System.out.println("Enter the total no. of hours used");
		int h = sc.nextInt();
		System.out.println("Enter the total cost used");
		int co = sc.nextInt();
		
		Elec a = new Elec();
		int bill = a.electricity(kw, h, co);
		System.out.println("Electricity bill is"+ " "+ bill);
		

	}
	
	int electricity(int x, int y, int z){
		int res = x*y*z;
		return res;
	}

}
