package WAP;

import java.util.Arrays;

public class ArrayNames {

	public static void main(String[] args) {
		String name[] = { "aman", "arun", "rohit", "nikky",} ;
		//System.out.println(name[]);
		
		
		//String str = Arrays.toString(name);
   int count =0;
		for(int j=0;j<name.length;j++)
		{
			System.out.println(name[j]);
			
	}
		String ch ="a";
;		for(String i : name) {
			  if(i.startsWith(ch)){
				    count++; 
				    }
}  
		System.out.println(count);
}
}

