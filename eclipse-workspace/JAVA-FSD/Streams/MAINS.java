import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MAINS {
 public static void main(String[] args) {
	 List<Integer> l1=new ArrayList<Integer>();
	 l1.add(2);
	 l1.add(4);
	 l1.add(1);
	 l1.add(2);
	 l1.add(6);
	 l1.add(3);
	 l1.add(5);
	 l1.add(3);
	 
	 System.out.println("initial list"+" "+l1);
	 //removing duplicates from list using streams
	 
//	 List<Integer> l2=l1
//			 .stream()
//			 .distinct()
//			 .collect(Collectors.toList());
//	 System.out.println("list after removing duplicates"+" "+l2);
	 
	 //print even numbers in  a list
	 
//	 l1
//	 .stream()
//	 .filter(num->num%2==0)
//	 .forEach(a->System.out.println(a));
	 
	 // remove duplicates and print even numbers and multiply the even numbers with 5 in a list
	 
//	 List<Integer> l2=l1
//	 .stream()
//	 .distinct()
//	 .filter(num->num%2==0)
//	 .map(num1->num1*5)
//	 .collect(Collectors.toList());
//	 System.out.println("result "+l2);
	 
	 //Count of even numbers in a list
	 
	 long count =l1
			 .stream()
			 .filter(num->num%2==0)
			 .count();
	 
	System.out.println("count "+count);
			 
 }
}
