import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class InterviewPrograms {
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
		
		String str1 = "Hello";
		 String str2 = str1;
		 str1 = str1 + " World";
		 System.out.println("str1: " + str1);
		 System.out.println("str2: " + str2);
		 System.out.println("Is String immutable: " + !str1.equals(str2));
		 
	}

}
