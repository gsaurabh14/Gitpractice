package WAP;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
		int armstrongno = 0;
Scanner sc = new Scanner(System.in);
System .out.println("enter the lower limit");
int i  = sc.nextInt();
System .out.println("enter the upper limit");
int j= sc.nextInt();
 while(i<j){
	 armstrongno = Arm.strong(i);
	 if(armstrongno==i)
			System.out.println(i);
			i++; 
 }
 sc.close();

	}
	static int strong(int num){
		int x, a = 0;
		while(num!=0)
	{
			x=num%10;
			a=a+(x*x*x);
			num/=10 ;	 
	}
		return a;
	}
}
