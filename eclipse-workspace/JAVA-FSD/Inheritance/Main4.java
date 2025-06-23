//Multilevel inheritance

//class Animal {
//    void eat() {
//        System.out.println("Animal eats");
//    }
//}
//
//class Mammal extends Animal {
//    void walk() {
//        System.out.println("Mammal walks");
//    }
//}
//
//class Dog extends Mammal {
//    void bark() {
//        System.out.println("Dog barks");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();   // From Animal
//        d.walk();  // From Mammal
//        d.bark();  // From Dog
//    }
//}

public class Main4 {
public static void main(String[] args) {
	Car c1=new Car("hundai",5);
	System.out.println(c1.countSeats());
	Mercedes m1=new Mercedes("hero",7);
	m1.createAccount("kakanuri");
	System.out.println(m1.getAccountHoldersList());
	System.out.println(m1.countSeats());
}
}
