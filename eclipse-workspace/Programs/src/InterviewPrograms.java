import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewPrograms {
	
//	public static int binarysearch(int[] arr,int key) {
//		int low=0;
//		int high=arr.length-1;		
//		while(low<=high) {
//			int mid=low+high/2;
//			if(arr[mid]==key) {
//				return mid;
//			}
//			else if(arr[mid]<key) {
//				low=mid+1;
//			}
//			else {
//				high=mid-1;
//			}
//		}
//		
//		return -1;
//	}
	
//	public static boolean isPrime(int n) {
//		
//		if(n<=1) {
//			return false;
//		}
//		else {
//			for(int i=2;i<Math.sqrt(n);i++) {
//				if(n%i==0) {
//					
//					return false;
//				}
//			}
//		}
//		return true;
//	}
	

	public static void main(String[] args) {
		//how to check if string contains only digits
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter input");
//		String input=sc.nextLine();
//		boolean numeric=true;
//		for(int i=0;i<input.length();i++) {
//			if(!Character.isDigit(input.charAt(i))) {
//				numeric=false;
//				break;
//			}
//		}
//		System.out.println("String contains only numerics"+" "+numeric);
	
		
		//Swap first and last elements in an array
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size of an array");
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		System.out.println("Enter  array elements");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int temp=arr[0];
//		arr[0]=arr[arr.length-1];
//		arr[arr.length-1]=temp;
//		
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
		
		// write a program to remove duplicates in an array
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array size");
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		Set<Integer> hasset=new HashSet<Integer>();
//		
//		for(int num:a) {
//			hasset.add(num);
//		}
//		int arrayAfterRemovingDuplicates[]=new int[hasset.size()];
//		int i=0;
//		for(int num1:hasset) {
//			arrayAfterRemovingDuplicates[i++]=num1;
//		}
//		System.out.println(Arrays.toString(arrayAfterRemovingDuplicates));
		
		// with arraylist and also converting array to arraylist
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array size");
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		 List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,3,1,2));
//		 List<Integer> l2=arrayList.stream().distinct().collect(Collectors.toList());
//		System.out.println(l2);
		
		
		// arraylist to array
		
//		List<Integer> l3=new ArrayList<Integer>();
//		l3.add(2);
//		l3.add(1);
//		l3.add(4);
//		l3.add(1);
//		int[] arra=l3.toArray(new int[0]);
		
		// implement a functional interface
		
//		public interface functionalinterface{
//			void display();
//		default void sayHello() {
//	        System.out.println("Hello from default method");
//	    }
//
//	    // Static method (optional)
//	    static void utility() {
//	        System.out.println("Static utility method");
//	    }
//		}
//		public static void main(String[] args) {
//			functionalinterface f1=()->System.out.println("hi");
//			f1.display();
//		f1.sayHello();
//		functionalinterface.utility();
		//}
		
		// try catch
//		try {
//			
//		}
//		catch(Exception e) {
//			
//		}
		
		//try with resources no need of finally block
//		try(Resourcetype rs=new Resourcetype()){
//			
//		}
//		catch(Exception e) {
//			
//		}
		
		//how could you prove that strings are immutable both literals and objects 
		
//		String str1="hello";
//		String str2=str1;
//		str1=str1.concat(str2); // new string object is created 
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println("strings are immutable"+" "+str1.equals(str2));
//		
//		String str3=new String("heloo1");
//		String str4=str3;
//		str3.concat("world4");  // will create a new string object but no variable to catch it so this will be discarded
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println("strings are mutable"+" "+str3.equals(str4));
//		
//		String str5=new String("helggoo1");
//		String str6=str5;
//		str5=str5.concat("worlggd4");  // will create a new string object but no variable to catch it so this will be discarded
//		System.out.println(str5);
//		System.out.println(str6);
//		System.out.println("strings are immutable"+" "+str5.equals(str6));
//		
//		StringBuffer sb1=new StringBuffer("loll");
//		StringBuffer sb2=sb1;
//		sb1.append("kakaa");
//		System.out.println(sb1);
//		System.out.println(sb2);
//		System.out.println("strings are mutable by string buffers"+" "+sb1.equals(sb2));
 
		// sort hashmap by key 
		
//		Map<String,Integer> map=new HashMap<>();
//		map.put("One", 1);
//		 map.put("Three", 3);
//		 map.put("Two", 2);
//		 
//		 Map<String,Integer> map1=map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
//		 System.out.println(map1);
//		 // sort hashmap by value
//		 Map<String,Integer> map2=new HashMap<>();
//			map2.put("One", 1);
//			 map2.put("Three", 3);
//			 map2.put("Two", 2);
//			 
//			 Map<String,Integer> map3=map2.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
//			 System.out.println(map3);
		
		// binary search in java
		
//		int[] arr= {4,8,1,3};
//		int key=8;
//		int result=InterviewPrograms.binarysearch(arr,key);
//		if(result==-1) {
//			System.out.println("not found");
//			
//		}
//		else {
//			System.out.println("found");
//		}
		 
		// if a vowel is present in string
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string");
//		String input=sc.nextLine();
//		boolean isVowel=false;
//		for(int i=0;i<input.length();i++) {
//			char ch=Character.toLowerCase(input.charAt(i));
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
//				isVowel=true;
//				break;
//				
//			}
//		}
//		System.out.println("check string has vowel are not"+" "+isVowel);
		
		//check prime or not
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number");
//		int b=sc.nextInt();
//		boolean result=isPrime(b);
//		System.out.println(result);
		
		//factorial of a number
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		int h=sc.nextInt();
//		int fac=1;
//		for(int i=1;i<=h;i++) {
//			fac=fac*i;
//		}
//			System.out.println(fac);
		
		// reverse a string
		
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("enter string");
//		 String s=sc.nextLine();
//		 String rs="";
//		 for(int i=s.length()-1;i>=0;i--) {
//			 rs+=s.charAt(i);
//		 }
//		 System.out.println(rs);
		
		//palindrome
		
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("enter string");
//		 String s=sc.nextLine();
//		 String rs="";
//		 for(int i=s.length()-1;i>=0;i--) {
//			 rs+=s.charAt(i);
//		 }
//		 System.out.println(rs);
//		 boolean resultPalindrome=s.equals(rs);
//		 System.out.println(resultPalindrome);
		
		//occurance of characters in a string
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string");
//     	String s=sc.nextLine();
//		Map<Character,Long> map=s.chars()
//				.mapToObj(c->(char)c)
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		map.entrySet().stream().forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
		
      // occurance for particular character	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		
		System.out.println("enter character");
     	String s=sc.nextLine();
     	char ch=sc.next().charAt(0);
		Map<Character,Long> map=s.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
//		Optional<Long> l=Optional.ofNullable(map.get(ch));
//		System.out.println(l);
//		String result=l.map(e->"found "+e).orElse("not found");
//		System.out.println(result);
		
		List l2=map.entrySet().stream().filter(e->e.getKey().equals(ch)).map(e->e.getValue()).collect(Collectors.toList());
		Optional<String> ok=Optional.empty();
		ok.ifPresentOrElse(e->System.out.println(e), System.out.println("not found"));
		
		
		//map.entrySet().stream().filter(e->e.getKey().equals(ch)).forEach(e->System.out.println(e.getValue()));
	//map.entrySet().stream().filter(e->e.getValue()==1).forEach(e->System.out.println(e.getKey()));
		
	}
	
	

}
