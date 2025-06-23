import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter input");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int temp=n;
	    int rev=0;
	    while(n!=0) {
	    	int rem=n%10;
	    	rev=rev*10+rem;
	    	n=n/10;
	    	
	    }
	    if(temp==rev) {
	    	System.out.println(rev);
	    	System.out.println("Reverse");
	    }
	    else {
	    	System.out.println(rev);
	    	System.out.println("Not Reverse");
	    }
	}

}
