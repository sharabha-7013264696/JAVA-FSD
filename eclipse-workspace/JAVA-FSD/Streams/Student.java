
public class Student {
	int id;
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Student() {
		
	}
	String name;
	Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
