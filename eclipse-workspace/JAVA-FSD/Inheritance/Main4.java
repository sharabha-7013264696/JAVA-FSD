
public class Main4 {
public static void main(String[] args) {
	Car c1=new Car("hundai",5);
	System.out.println(c1.countSeats());
	Mercedes m1=new Mercedes("hero",7);
	m1.createAccount("kakanuri");
	System.out.println(m1.getAccountHoldersList());
	System.out.println(m1.countSeats());
}
}
