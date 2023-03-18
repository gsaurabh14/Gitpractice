package Democollection;

import java.util.LinkedList;

public class Demolinklist {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		 llist.add("A");
		 llist.add("B");
		 llist.addFirst("Q");
		 llist.add(1, "W");
		 
		 System.out.println(llist);
		 
		 llist.remove("A");
		 System.out.println(llist);
		 llist.remove(2);
		 System.out.println(llist);
	}

}
