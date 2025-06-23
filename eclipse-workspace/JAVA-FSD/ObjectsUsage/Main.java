import java.util.*;
public class Main {
  public static void main(String[] args) {
	  Bank sbi=new Bank();
	  sbi.createAccount("sharabha");
	  System.out.println(sbi.getAccountHoldersList());
	  System.out.println(sbi);//address of memory in heap
  }
}
