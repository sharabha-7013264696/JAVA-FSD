
public class Main10 {
	public static void main(String[] args) {
//		WithoutMultiThreading j=new WithoutMultiThreading();
//		j.WMT();
		MultiThreadingWithChildClass m4=new MultiThreadingWithChildClass();
		m4.start();
		MultiThreading1 m5=new MultiThreading1();
		m5.start();
	}
	


}
