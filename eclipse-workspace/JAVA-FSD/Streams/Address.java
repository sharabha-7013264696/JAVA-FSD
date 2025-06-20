
public class Address {
	int pincode;
	String city;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {
		
	}
	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}

}
