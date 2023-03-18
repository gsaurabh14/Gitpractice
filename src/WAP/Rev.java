package WAP;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println(str);
		String revofstr = Rev.Reverse(str);
		System.out.println("here you go -"+ " "+ revofstr);

	}
	static String Reverse(String s)
	{
		String temp = "";
		int l = s.length();
		for(int i=l;i>0;i--)
		{
		temp = temp + s.charAt(i-1);
		}
		return temp;
	}

}
