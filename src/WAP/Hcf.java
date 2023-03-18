package WAP;

import java.util.Scanner;

public class Hcf {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 number");
		int a = sc.nextInt();
		System.out.println("Enter the 2 number");
		int b = sc.nextInt();
		 Hcf h = new Hcf();
		 int ans = h.findhcf(a, b);
		 System.out.println("hcf of two number is"+ " "+ ans);
		 sc.close();
		
	}

	int findhcf(int n1, int n2){
		int res=0, temp ;
		while(n2>0){
			temp = n2; 
		  res = n2%n1;
			n2 = n1%n2;
			n1 = temp;
		}
		return res;
	}
}
