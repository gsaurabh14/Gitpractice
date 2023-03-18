package WAP;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string to check if palindrome");
		String text = sc.nextLine();
		
		
		
		String revText = reverse(text);
		System.out.println(text);
		System.out.println(revText);

	}

	 static String reverse(String text) {
		
		 String[] words = text.split(" ");
		 String revString="";
		 for(String word : words) {
			 StringBuilder sb = new StringBuilder(word);
			 revString = revString+sb.reverse()+" ";
		 }
		return revString;
		 
		 
	 }
}
