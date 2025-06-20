import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mains1 {
	public static void main(String[] args) {
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
		m1
		.entrySet()
		.stream()
		.filter(entry->entry.getValue().equals("social"))
		.forEach(entry->System.out.println(entry.getKey()));
	}
	

}
