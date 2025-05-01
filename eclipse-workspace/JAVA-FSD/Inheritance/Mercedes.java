
public class Mercedes extends Car{

//With super() keyword to call the constructor of parent class
  public Mercedes(String names,int seasts) {
	  super(names,seasts);
	  	  System.out.println("klamm");
  }
	//without super class to access methods from parent class
//	public Mercedes(String name) {
//		this.carName=name;
//	}
}
