
public class Exceptionsclasss {



		public static void main(String[] args) {
			try {
				int a=10/0;
				int [] numbers=new int[10];
				numbers[12]=10;
				int b=12;
				System.out.println("kill"+b);
				
			}
//			catch(ArithmeticException a) {
//				System.out.println("hi");
//			}
			catch(ArrayIndexOutOfBoundsException b) {
				System.out.println("hi1");
			}
			catch(Exception e) {
				System.out.println("hi2");
			}
			int c=70;
			System.out.println(c);
//			try{
//				throw new ArrayIndexOutOfBoundsException("COOL");
//			}
//			catch(Exception e) {
//				System.out.println(e.getMessage());
//			}
		}

	


}
