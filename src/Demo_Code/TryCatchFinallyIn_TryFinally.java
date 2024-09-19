package Demo_Code;

public class TryCatchFinallyIn_TryFinally {

	public static void main(String[] args) {

		try {
			int a=100;
			int b= 0;
			int c=a/b;
			}
	   catch(Exception e) {
	   System.out.println(e);
	   }
		
		finally {
			System.out.println("this is first try finally");
			
			try {
				int[]a=new int[2];
				a[1]=100;
				System.out.println(a[1]);
			}
			finally {
				System.out.println("this is a second try finally");
			}
			
		}
				
	}

}
