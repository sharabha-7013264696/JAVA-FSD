import java.util.Objects;

public class Students {
	int id;
	public Students(int id, String name, Addresses address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Students() {
		
	}
	String name;
	Addresses address;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
	}
	public Addresses getAddress() {
		return address;
	}
	public void setAddress(Addresses address) {
		this.address = address;
	}

}
