package Democollection;

import java.util.HashSet;

public class demohashset {

	public static void main(String[] args) {
	HashSet<String> ab = new HashSet<>();
	
	ab.add("S");
	boolean r1 = ab.add("C");
	System.out.println(r1);
	boolean r2 =ab.add("C");
	System.out.println(r2);
	
	
	System.out.println(ab);

	System.out.println("list have c or not" + ab.contains("C"));
	}

}
