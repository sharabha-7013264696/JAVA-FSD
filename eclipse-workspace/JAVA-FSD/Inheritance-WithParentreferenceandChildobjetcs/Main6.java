
public class Main6 {
	public static void main(String[] args) {
//		BB b=new CC();
//		b.sayHello();
//		b.sayHelloA();
//		System.out.println(b.c);
		
		//below is the one for downcasting
		BB bb=new CC();
		CC cc=(CC) bb;
		cc.sayHelloC();
		
	}
 
}
