// Will follow bottom to top approach if the say Hello method is present in C class it will print it or else check in B and A
public class Main5 {
 public static void main(String[] args) {
//	 A a=new A();
//	 a.sayHello();
	 
//	 B b=new B();
//	 b.sayHello();
	 
//	 C c=new C();
//	 c.sayHello();
	 
	// B b=new A();//Assigning parent object to childs reference is not possible, need to downcast it
	 C c=new C();
	 c.sayHello();//sayHello is not present in C class will take sayHello from B class , if not present in B will take it from A
 }
}
