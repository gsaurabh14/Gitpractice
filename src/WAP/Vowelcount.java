package WAP;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
	String s;
	System.out.println("enter string");
	Scanner sc = new Scanner(System.in);
	s = sc.nextLine();
	System.out.println("all the vowels present are");
	vow(s);

	}
static void vow(String str)
{
	int i = 0;
	char ch ;
	for(int j = 0; j<str.length();j++)
	{
		ch= str.charAt(j);
		switch(ch)
		{
		 case  'a' :
		 case 'e'  :
		 case 'i'  :
		 case 'o'  :
		 case 'u'  :
		 case  'A' :
		 case 'E'  :
		 case 'I'  :
		 case 'O'  :	
		 case 'U'  :
			 i=1;
			System.out.println(ch); 			 
		}	
	}
	if(i==0)
		System.out.println("there are no vowels in string");
	
}

}
