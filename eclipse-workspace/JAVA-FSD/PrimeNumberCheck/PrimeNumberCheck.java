import java.util.Scanner;
//prime number if a number is divisible by one and itself
public class PrimeNumberCheck {
	public static boolean isPrime(int m) {
		if(m<=1) {
			return false;
		}
		else {
			for(int i=2;i<=Math.sqrt(m);i++) {
				if(m%i==0) {
					return false;
				}
			}
		}
		return true;
		
	}
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int m=sc.nextInt();
//		boolean x=isPrime(m);
//		if(x) {
//			System.out.printf("%d is a prime number",m);
//		}
//		else {
//			System.out.printf("%d is not a prime number",m);
//		}
//	}

	// first 10 prime numbers
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter count of numbers");
//		int n=sc.nextInt();
//		int count=0;
//		int i=1;
//		while(count<10) {
//			if(isPrime(i)) {
//				System.out.println(i);
//				
//				count++;
//			}
//			i++;
//		}
//	}
	
	//prime numbers between 1to 100
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
