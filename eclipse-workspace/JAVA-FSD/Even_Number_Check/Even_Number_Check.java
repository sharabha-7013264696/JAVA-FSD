import java.util.Scanner;

public class Even_Number_Check {
	public static void evenNumber(int n) {
		if(n==0) {
			System.out.printf("%d is neither even nor odd number",n);
		}
		else if(n%2!=0) {
			System.out.printf("%d is a odd number",n);
		}
		else {
			System.out.printf("%d is a even number",n);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		evenNumber(n);
		
	}

}
