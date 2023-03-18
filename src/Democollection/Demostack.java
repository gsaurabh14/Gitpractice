package Democollection;


import java.util.Stack;

public class Demostack {

	public static void main(String[] args) {
		Stack<String> dstack = new Stack<>();
		
		dstack.push("amaerica");
		dstack.push("italy");
		dstack.push("germany");
		
		System.out.println(dstack);
		
		String sd = dstack.peek();
		System.out.println("top element" + sd);
		dstack.pop();
		System.out.println(dstack);

	}

}
