//Without multithreading one for loop execute first followed by next for loop
public class WithoutMultiThreading {
	public void WMT() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread1"+" "+i);		}
		for(int i=0;i<10;i++) {
			System.out.println("Thread2"+" "+i);		}
	}

}
