
public class MainClass {
	public static void main(String[] args) {
		System.out.println("Static");
		ParentClass p1=new ParentClass();
		p1.add();
		ChildClass c1=new ChildClass();
		c1.add();
		ParentClass p2=new ChildClass();
				p2.add();
		System.out.println("Non-static");
		p1.product();
		c1.product();
		p2.product();
				
				
				
	}

}
