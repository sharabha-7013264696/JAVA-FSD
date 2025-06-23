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
		List<Character> li=new ArrayList<Character>();
		li.add('a');
		li.add('b');
		li.add('a');
		li.add('c');
		li.add('d');
		for(char num:li) {
			System.out.println(num);
		}
		System.out.println(li);
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(char a:li) {
			if(m.containsKey(a)) {
				int count=m.get(a);
				m.put(a, count+1);
			}
			else {
				m.put(a,1);
			}
		}
		System.out.println(m.keySet());
		for(char b:m.keySet()) {
			System.out.println(b+":"+m.get(b));
			if(m.get(b)==1) {
				System.out.println(b+":"+m.get(b));
			}
			
		}
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.remove('d'));
		
	}

	
	
	
	

}
