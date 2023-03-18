package WAP;

import java.util.Scanner;

public class Reversestring {
	public static void main(String args[]){
		//String s1="rahul shetty academy";
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		Reversestring r = new Reversestring();
		r.rev(text);
		
		
	}

	String rev(String a){
		for(int i =a.length()-1;i>=0;i--){
			System.out.println(a.charAt(i));
		}
		return a;
	}
}
