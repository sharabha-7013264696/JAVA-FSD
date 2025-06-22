import java.util.ArrayList;
import java.util.List;

public class TestDriver {
public static void main(String[] args) {
	Driver d1=new Driver(1,"sharabha","car",2000);
	Driver d2=new Driver(2,"sharabha","auto",277000);
	Driver d3=new Driver(3,"sharabha","lorry",244000);
	Driver d4=new Driver(4,"sharabha","lorry",22000);
	Driver d5=new Driver(5,"sharabha","car",203.700);
	Driver d6=new Driver(6,"sharabha","auto",92700.50);
	Driver d7=new Driver(7,"sharabha","car",12000);
	
	List<Driver> l1=new ArrayList<Driver>();
	l1.add(d1);
	l1.add(d2);
	l1.add(d3);
	l1.add(d4);
	l1.add(d5);
	l1.add(d6);
	l1.add(d7);
	
	System.out.println("Drivers list "+l1);
	
	Travel travel=new Travel();
	
	for(Driver h:l1) {
		System.out.println("Drivers list in vertically  "+h);
	}
	
	
}
}
