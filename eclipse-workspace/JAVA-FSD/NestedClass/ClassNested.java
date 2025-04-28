


public class ClassNested {
	public class Animal {
		public void sound() {
			System.out.println("hi");
		}
	}
	public class Dog extends Animal {
		public void sound() {
			System.out.println("hi1");
		}
	}
	
  public static void main(String[] args) {
	  ClassNested p=new ClassNested();
	  ClassNested.Animal a=p.new Animal();
	  ClassNested.Dog d=p.new Dog();
	  ClassNested.Animal f=p.new Dog();
	  a.sound();
	  d.sound();
	  f.sound();
	  
	  
	  
  }
}

