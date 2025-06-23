package Customclasssorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class CustomClassSorting {
	int id;
	String name;
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomClassSorting other = (CustomClassSorting) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public CustomClassSorting() {
		
	}
	
	public CustomClassSorting(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		List<CustomClassSorting> cs=new ArrayList<CustomClassSorting>();
		cs.add(new CustomClassSorting(4,"ggghui"));
		cs.add(new CustomClassSorting(3,"llhui"));
		cs.add(new CustomClassSorting(1,"hui"));
		cs.add(new CustomClassSorting(1,"ui"));
		cs.add(new CustomClassSorting(1,"a"));
		cs.add(new CustomClassSorting(2,"llhui"));
		cs.add(new CustomClassSorting(2,"ggghui"));
		cs.add(new CustomClassSorting(2,"llhui"));
		Comparator<CustomClassSorting> nm= (e1,e2)->e1.name.compareTo(e2.name);
		Comparator<CustomClassSorting> nm1= (e1,e2)->Integer.compare(e1.id,e2.id);
		Collections.sort(cs,nm);
		System.out.println(cs);
		Collections.sort(cs,nm1);
		System.out.println(cs);
		
		
		
	}

	@Override
	public String toString() {
		return "CustomClassSorting [id=" + id + ", name=" + name + "]";
	}

}
