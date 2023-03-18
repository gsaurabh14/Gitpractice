package WAP;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string to check if palindrome");
		String word = sc.next();
		
   if(isPalindrome(word))
	   System.out.println(word+" is palindrome");
   else
	   System.out.println(word+" is not palindrome");
   
   sc.close();
	}
  static boolean isPalindrome(String word) {
	  int forwardIndex=0, backwordIndex=word.length()-1;
	  while(forwardIndex<=backwordIndex) {
		  char starchar = word.charAt(forwardIndex);
		  char endchar = word.charAt(backwordIndex);
		  if(starchar != endchar)
			  return false;
		  forwardIndex++;
		  backwordIndex--;
	  }
	  
	  return true;
  }
}
