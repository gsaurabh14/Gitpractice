package Demohandlinexception;

import java.util.ArrayList;
import java.util.List;

public class DemoExceptionhandlin {
	
	public void writterlist(){
		try{
			List<Integer> list = new ArrayList<Integer>(10);
			list.add(10);
		System.out.println("Entering" + "try statement");
		Integer a = list.get(1);
		System.out.println("accessing the first element" + a);
		}catch(IndexOutOfBoundsException e){
			System.err.println(" Caught IndexOutOfBoundsException: " + e.getMessage());
		}finally {
			System.out.println("this will allways be executed");
		}
	}

}
