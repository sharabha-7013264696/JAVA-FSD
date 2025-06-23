import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mains1 {
	public static void main(String[] args) {
		 List<String> l1=new ArrayList<String>();
		 l1.add("suresh");
		 l1.add("ramesh");
		 l1.add("mkko");
		 l1.add("uimkko");
		 l1.add("powemkko");
		 l1.add("mkko");
		 l1.add("kioomkko");
		 l1.add("powemkko");
		 
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "english");
		m1.put(2, "social");
		m1.put(3, "maths");
		m1.put(1,"telugu");
		
		// print both key and values
		
//		m1.entrySet()
//		.stream()
//		.forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));
		 
		 // print only keys
		
//		m1.keySet()
//		.forEach(entry->System.out.println(entry));
//		
		//print only values
		
//		m1.values()
//		.forEach(entry->System.out.println(entry));
		
		//print both key, value only if keys >2
		
//		Map<Integer,String> m2=m1.entrySet()
//        .stream()
//        .filter(entry->entry.getKey()>1)
//        .collect(Collectors.toMap(entry->entry.getKey(),entry->entry.getValue()));
//		
//		
//		System.out.println("kii"+m2);
		
		//print key only if key >1
		
//		Map<Integer,String>m3=
//		m1.entrySet()
//		.stream()
//		.filter(entry->entry.getKey()>1)
//		.collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));
//		
//		m3
//		.entrySet()
//		.stream()
//		.forEach(entry->System.out.println(entry.getKey()));
		
		//print value only if value=social
		
//		m1
//		.entrySet()
//		.stream()
//		.filter(entry->entry.getValue().equals("social"))
//		.forEach(entry->System.out.println(entry.getKey()));
		
		
	//Grouping By
		
	//Frequency of strings in a list
		//counting only accepts Long type 
		
//		Map<String,Long>m7=
//		l1
//		.stream()
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		m7
//		.entrySet()
//		.stream()
//		.filter(entry->entry.getValue().equals((long)1))
//		.forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));

	//Frequency of characters in a string
		
//		String input="apple";
//		Map<Character,Long> m8=
//		input
//		.chars()
//		.mapToObj(c->(char)c)
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		m8
//		.entrySet()
//		.stream()
//		.forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));
		
		//Streams on Arrays
		
		int[] a= {2,4,35,9};
	
		int[] b=Arrays
		.stream(a)
		
		.sorted()
		
		.toArray();
		System.out.println(b);
		
		
		
		
	}
	

}
