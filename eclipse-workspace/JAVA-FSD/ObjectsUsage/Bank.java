import java.util.*;
public class Bank {
	ArrayList<String> accountHolderslist=new ArrayList<>();
	int totalCash=0;
	public  void createAccount(String accountName) {
		accountHolderslist.add(accountName);
		  System.out.println(accountHolderslist.add(accountName));
	}
   public void depositAmount(int amount) {
	   totalCash+=amount;
   }
   public  ArrayList<String> getAccountHoldersList() {
		  return accountHolderslist;
	}
}
