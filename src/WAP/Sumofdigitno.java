package WAP;

import java.util.Scanner;

public class Sumofdigitno {

	public static void main(String[] args) {
		int ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Sumofdigitno b = new Sumofdigitno();
		ans= b.sum(num);
		System.out.println("Sum of the digits of number is"+" "+ ans);
		sc.close();
		

	}
	int sum(int x){
	int res = 0;
	while(x!=0){
	res=res+(x%10);
	x/=10;
	}
	return res;
	}
}
