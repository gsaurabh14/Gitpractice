package WAP;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
	int n = sc.nextInt();	
	int a[] = new int[n];
	
	for(int i=0;i<n;i++)
		a[i] = sc.nextInt();
System.out.println(Arrays.toString(a));
	}

}
