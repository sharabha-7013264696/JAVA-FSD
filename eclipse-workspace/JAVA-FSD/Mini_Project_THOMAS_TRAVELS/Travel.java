import java.util.ArrayList;

public class Travel {
	public boolean isCarDriver(Driver driver) {
		if(driver.getCategory().equals("car")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String  RetrivebyDriverId (ArrayList<Driver> driverList,int driverID) {
		for(Driver f:driverList) {
			if(f.getId()==driverID) {
				return "Driver name is "+f.getDriverName()+" belonging to the category "+f.getCategory()+" traveled "+f.getTotalDistance()+"so far";  
			}
		}
		return "NOT FOUND"; 
	}
	
	public int RetriveCountOfDriver (ArrayList<Driver>driverList,String category) {
		int count=0;
		for(Driver d:driverList) {
			
			if(d.getCategory().equals(category)) {
				count++;
			}
		}
		return count;
	}
	public ArrayList<String> retriveDriver (ArrayList<Driver>driverList,String category){
		ArrayList<String> k=new ArrayList<String>();
		for(Driver d:driverList) {
			if(d.getCategory().equals(category)) {
				k.add(d.getDriverName());
			}
			
		}
		return k;
	}
	public double RetriveMaximumDistanceTravelledDriver(ArrayList<Driver> lists) {
		Driver d=lists
		.stream()
		.sorted((e1,e2)->Double.compare(e2.getTotalDistance(), e1.getTotalDistance()))
		.findFirst()
		.get();
		return d.getTotalDistance();
	}
	
	

}
