public class ExceptionsClass {
	public static void main(String[] args) {
		try {
			int a=10/0;
			int [] numbers=new int[10];
			numbers[12]=10;
			
		}
		
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("hi1");
		}
		catch(Exception e) {
			System.out.println("hi2");
		}
	}

}
