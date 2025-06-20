import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MAINS {
	
 public void add() {
	 
 }

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
	 
//	 List<Character> l1=new ArrayList<Character>();
//	 l1.add('v');
//	 l1.add('b');
//	 l1.add('b');
//	 l1.add('a');
//	 l1.add('h');
//	 l1.add('g');
//	 l1.add('c');
//	 l1.add('o');
//	 
// System.out.println("initial list"+" "+l1);
	 
//	 List<String> l1=new ArrayList<String>();
//	 l1.add("suresh");
//	 l1.add("ramesh");
//	 l1.add("mkko");
//	 l1.add("uimkko");
//	 l1.add("powemkko");
//	 l1.add("mkko");
//	 l1.add("kioomkko");
//	 l1.add("ddsmkko");
//	 
//	 System.out.println("initial list"+" "+l1); 
	 
	 Address address1=new Address(518501,"Nandyal");
	 Address address2=new Address(518401,"ANandyal");
	 Address address3=new Address(518502,"Nlllandyal");
	 Address address4=new Address(2518501,"lppNandyal");
	 Address address5=new Address(518509881,"Nandyal");
	 Address address6=new Address(518501,"Nandyal");
	 
	 Student student1=new Student(1,"sharabha",address1);
	 Student student2=new Student(5,"jjjsharabha",address2);
	 Student student3=new Student(2,"llsharabha",address3);
	 Student student4=new Student(6,"ppsharabha",address4);
	 Student student5=new Student(3,"rrsharabha",address5);
	 Student student6=new Student(1,"sharabha",address6);
	 
	 List<Student> students=new ArrayList<Student>();
	 students.add(student1);
	 students.add(student2);
	 students.add(student3);
	 students.add(student4);
	 students.add(student5);
	 students.add(student6);
	 System.out.println(students);
	 
	 
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
	 
//	 long count =l1
//			 .stream()
//			 .filter(num->num%2==0)
//			 .count();
//	 
//	System.out.println("count "+count);
	 
	 // highest element in a list
	 
	 int l7=l1
			 .stream()
			 .sorted(Comparator.reverseOrder())
			 .findFirst()
	         .get();
	 System.out.println("highest element in list "+l7);
	 
	 // second highest element in a list
	 
	 int l8=l1
			 .stream()
			 .sorted((emp1,emp2)->Integer.compare(emp2, emp1))
			 .skip(1)
			 .findFirst()
			 .get();
	 System.out.println("second highest "+l8);
	 // sum() , max(), min(), avg() directly wont work on wrapper class need to convert those to primitive data types i.e Integer->int this convertion is called as auto-unboxing			 
     
//	 int sum=l1
//			 .stream()
//			 .mapToInt(n->n)
//			 .sum();
//	 System.out.println("sum of list "+sum);
	 
//	 double avg=l1
//			 .stream()
//			 .mapToInt(n->n)
//			 .average()
//			 .getAsDouble();
//			 
//	 System.out.println("sum of list "+avg);
	 
//	 int num=l1
//			 .stream()
//			 .mapToInt(n->n)
//			 .max()
//			 .getAsInt();
//			 
//	 System.out.println("sum of list "+num);
	 
	 
     // sort elements in a list in descending order
//	 List<Integer> l4=l1
//			 .stream()
//			 .sorted((num1,num2)->Integer.compare(num2, num1))
//			 .collect(Collectors.toList());
//	 System.out.println("sort "+l4);
	 
//	 List<Character> l4=l1
//			 .stream()
//			 .sorted((num1,num2)->num1.compareTo(num2))
//			 .collect(Collectors.toList());
//	 System.out.println("sort "+l4);
	 
	 //sort elements on custom classes
	 
//	 List<Student> l5=students
//			 .stream()
//			 .distinct()
//			 .sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
//			 .collect(Collectors.toList());
//	 System.out.println("sort elements in an object "+l5);
	 
	 //sort elements on custom classes of address field of another class having pincode, city
	 
//	 Set<Student> l5=students
//			 .stream()
//			 .sorted((e1,e2)->Integer.compare(e1.getAddress().getPincode(),e2.getAddress().getPincode()))
//			 .collect(Collectors.toSet());
//	 System.out.println("pincode "+l5);
	  
	 // filter based on name with sharabha
	 
//	 List<Student> l6=students
//			 .stream()
//			 .filter(e1->e1.getName().equals("sharabha"))
//			 .collect(Collectors.toList());
//	 System.out.println("kkk "+l6);
	 
	 
	 // filter based on name with sharabha
	 
	 List<Student> l6=students
			 .stream()
			 .filter(e1->e1.getName().startsWith("s"))
			 
			 .collect(Collectors.toList());
	 
	 System.out.println("kkk "+l6);
	 
 }
}
