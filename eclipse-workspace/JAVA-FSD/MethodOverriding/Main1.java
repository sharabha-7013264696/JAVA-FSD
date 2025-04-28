//You cannot override static methods (those belong to the class, not the object).
//
//You cannot override private methods (they aren't inherited).
//
//You cannot override constructors (constructors are not methods).
public class Main1 {
	public static void main(String[] args) {
		Parent1 p=new Child(); // since method overriding we gave parent reference to child object
		p.sound();
	}

}
