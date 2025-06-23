
public class Main8 {
	static int a=10;
	int b=20;
	private int c=30;
	public static void main(String[] args) {
		Ecapsulation ef =new Ecapsulation("kakanuriSharabha","sharabhareddyk@gamil.com");
		System.out.println(ef.getName());
		ef.setName("Reddy");
		System.out.println(ef.getName());
		
		Main8 h=new Main8();
		System.out.println(a);
		System.out.println(h.b);
		System.out.println(h.c);
	}

}
