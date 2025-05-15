import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int h=sc.nextInt();
	  int k=h;
	  int y=h;
	  int count=0;
	  int result=0;
	  while(h!=0) {
		  count++;
		  h=h/10;
	  }
	  while(k!=0) {
		  int rem=k%10;
		  result+=Math.pow(rem, count);
		  k=k/10;
	  }
	  if(k==h) {
		  System.out.printf("%d is Armstrong",y);
	  }
	  else {
		  System.out.println("Not Armstrong");
	  }
  }
}
