//You cannot override static methods (those belong to the class, not the object).
//
//You cannot override private methods (they aren't inherited).
//
//You cannot override constructors (constructors are not methods).

//Overriding works only for methods not for variables or properties because methods are bound at run time based on object where as variables or properties are bound at compile time based on reference
public class Main1 {
	public static void main(String[] args) {
		Parent1 p=new Child(); // since method overriding we gave parent reference to child object
		p.sound();
		System.out.println(p.a);
	}

}
