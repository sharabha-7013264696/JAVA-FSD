// reduce works 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(1);
		l1.add(5);
		l1.add(7);
		
		int sum=l1.stream()
				.reduce(0, (a,b)->a+b);
		
		System.out.println(sum);
		
		int product=l1.stream()
				.reduce(1, (a,b)->a*b);
		System.out.println(product);
		
		List<String> n=new ArrayList<String>(Arrays.asList("fayaz","ki","lo")	);
		String name=n
				.stream()
				.reduce("", (a,b)->a+" "+b);
		System.out.println(name.trim());
				
		
	}

}
