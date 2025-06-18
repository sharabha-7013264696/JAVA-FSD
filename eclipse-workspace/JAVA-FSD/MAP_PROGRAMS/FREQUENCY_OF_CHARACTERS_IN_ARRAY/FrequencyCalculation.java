package FREQUENCY_OF_CHARACTERS_IN_ARRAY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FrequencyCalculation {
	int a;
	String name;
	
	public FrequencyCalculation(int a, String name) {
		super();
		this.a = a;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(a, name);
	}

	@Override
	public String toString() {
		return "FrequencyCalculation [a=" + a + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FrequencyCalculation other = (FrequencyCalculation) obj;
		return a == other.a && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		
		FrequencyCalculation f=new FrequencyCalculation(1,"name");
		System.out.println(f.hashCode());
		System.out.println(f);
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(1);
		li.add(3);
		li.add(3);
		for(Integer num:li) {
			System.out.println(num);
		}
		System.out.println(li);
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int a:li) {
			if(m.containsKey(a)) {
				int count=m.get(a);
				m.put(a, count+1);
			}
			else {
				m.put(a,1);
			}
		}
		for(int b:m.keySet()) {
			if(m.get(b)==1) {
				System.out.println(b+":"+m.get(b));
			}
			
		}
		
	}

	
	
	
	

}
