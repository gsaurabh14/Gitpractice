package WAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//import net.jodah.failsafe.internal.util.Assert;

public class Demostream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("Aman");
		names.add("Ankit");
		names.add("loisaaa");
		names.add("Anaa");
		
		long c =names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
  
		long d =Stream.of("Anna", "Ankit","lois", "Aman").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		
		System.out.println(d);	
		
		//names.stream().filter(s->s.length()>4).forEach(s-> System.out.println(s));
		//names.stream().filter(s->s.length()>4).limit(1).forEach(s-> System.out.println(s));
		
		//Stream.of("Anna", "Ankit","lois", "Aman").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//Stream.of("Anna", "Ankit","lois", "Aman").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String>names1 = Arrays.asList("Anna", "Alum", "arpchit");
		names1.stream().filter(s->s.startsWith("A")).count();
		
		Stream<String> newstream = Stream.concat(names.stream(), names1.stream());
		newstream.forEach(s-> System.out.println(s));
		
		Boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("Aman"));
		System.out.println(flag);
		
		
		
	}

	

}
