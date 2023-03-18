package Democollection;

import java.util.PriorityQueue;
import java.util.Queue;

public class demoqueue {

	public static void main(String[] args) {
		Queue<String> demo = new PriorityQueue<>();
		 demo.add("america");
		 demo.add("india");
		 demo.add("germany");
		 
		 System.out.println(demo);
		 
		 String top = demo.peek();
		 System.out.println(top);
		 
		 demo.remove();
		 
		 System.out.println(demo);
		 
		 demo.poll();
		 System.out.println(demo);

	}

}
