import java.util.ArrayList;

public class Car {
	ArrayList<String> accountHolderslist=new ArrayList<>();
	int totalCash=0;
	String carName;
	int numberOfSeats;
	public  void createAccount(String accountName) {
		accountHolderslist.add(accountName);
		  System.out.println(accountHolderslist.add(accountName));
	}
   public void depositAmount(int amount) {
	   totalCash+=amount;
   }
   public int countSeats() {
	   return numberOfSeats;
   }
   public  ArrayList<String> getAccountHoldersList() {
		  return accountHolderslist;
	}
   public Car(String name,int seats) {
	   
	   this.carName=name;
	   this.numberOfSeats=seats;
   }
}
