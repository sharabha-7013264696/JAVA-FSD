
public class TRY_CATCH_FINALLY {
	public static int returntypes() {
		//program 4
		
//				int x=0;
//				try {
//					int y=++x/0;
//						return 0;	
//					}
//			
//			catch(Exception e) {
//				System.out.println("hi"+" "+ x);
//				return 1;
//				
//			}
		
		//program 5 
		int x=0;
		try {
			int y=x;
				return 0;	
			}
	
	catch(Exception e) {
		System.out.println("hi"+" "+ x++);
		return 1;
		
	}
		finally{
			System.out.println("hi1"+" "+ x++);
			
		}
				

	}
	public static void main(String[] args) {
		//program1
		
//		int x=0;
//		try {
//			int y=x;
//			System.out.println(y);		}
//	
//	catch(Exception e) {
//		System.out.println("hi"+" "+x);
//		
//	}
		
		//program2
		
//		int x=0;
//		try {
//			int y=x++/0;
//			System.out.println(y);		}
//	
//	catch(Exception e) {
//		System.out.println("hi"+" "+ x);
//		
//	}
		
		//program3
		
//		int x=0;
//		try {
//			int y=++x/0;
//			System.out.println(y);		}
//	
//	catch(Exception e) {
//		System.out.println("hi"+" "+ x);
//		
//	}
		int result =returntypes();
		System.out.println(result);
				

}
}
