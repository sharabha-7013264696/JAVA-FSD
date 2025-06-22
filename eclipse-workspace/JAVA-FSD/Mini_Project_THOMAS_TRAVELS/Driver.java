import java.util.Objects;

public class Driver {
	@Override
	public String toString() {
		return "Driver [id=" + id + ", driverName=" + driverName + ", category=" + category + ", totalDistance="
				+ totalDistance + "]";
	}
	int id;
	String driverName;
	String category;
	double totalDistance;
	public Driver(int id, String driverName, String category, double totalDistance) {
		super();
		this.id = id;
		this.driverName = driverName;
		this.category = category;
		this.totalDistance = totalDistance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, driverName, id, totalDistance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		return Objects.equals(category, other.category) && Objects.equals(driverName, other.driverName)
				&& id == other.id && totalDistance == other.totalDistance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getTotalDistance() {
		return totalDistance;
	}
	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}
	

}
