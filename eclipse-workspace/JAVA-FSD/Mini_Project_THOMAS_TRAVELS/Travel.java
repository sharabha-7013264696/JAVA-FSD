import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Travel {
	public boolean isCarDriver(Driver driver) {
		if(driver.getCategory().equalsIgnoreCase("car")) {
			return true;
		}
		else {
			return false;
		}
		
		//can't write the logic using streams because we can perform streams on collections only.
	}
	
	public String  RetrivebyDriverId (List<Driver> driverList,int driverID) {
//		for(Driver f:driverList) {
//			if(f.getId()==driverID) {
//				return "Driver name is "+f.getDriverName()+" belonging to the category "+f.getCategory()+" traveled "+f.getTotalDistance()+"so far";  
//			}
//		}
//		return "NOT FOUND"; 
		
		String n=driverList
		.stream()
		.filter(e->e.getId()==driverID)
		.findFirst()
		.map(e->String.format("Driver name is %s belonging to the category %s traveled  kms so far",e.getDriverName(),e.getCategory()))
		.orElse("Not found");
		return n;
	}
	
	public long RetriveCountOfDriver (List<Driver>driverList,String category) {
//		int count=0;
//		for(Driver d:driverList) {
//			
//			if(d.getCategory().equals(category)) {
//				count++;
//			}
//		}
//		return count;
		return driverList
		.stream()
		.filter(e->e.getCategory().equalsIgnoreCase(category))
		.count();
	}
	public List<Driver> retriveDriver (List<Driver>driverList,String category){
//		List<Driver> k=new ArrayList<Driver>();
//		for(Driver d:driverList) {
//			if(d.getCategory().equalsIgnoreCase(category)) {
//				k.add(d);
//			}
//			
//		}
//		return k;
		
		List<Driver> l1=driverList
		.stream()
		.filter(e->e.getCategory().equalsIgnoreCase(category))
		.collect(Collectors.toList());
		return l1;
	}
	public Driver RetriveMaximumDistanceTravelledDriver(List<Driver> lists) {
		Driver d=lists
		.stream()
		.sorted((e1,e2)->Double.compare(e2.getTotalDistance(), e1.getTotalDistance()))
		.findFirst()
		.get();
		return d;
	}
	
	

}
