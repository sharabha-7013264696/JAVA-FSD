
public class Main9 {
	
	public static  class Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
	public  class Product1{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
	public static void main(String[] args) {
	    Product pp=new Product();
	    System.out.println(pp.product(6, 9));
	    Main9 mm=new Main9();
	    Main9.Product1 p1=mm.new Product1();
	    System.out.println(p1.product(9, 8));
		Compiletimepolymorphism cp=new Compiletimepolymorphism ();
		cp.add(4, 7);
		cp.add(3, 4,5);
		System.out.println(cp.add(2.5,6.88, 9.88));
			
		}
}

