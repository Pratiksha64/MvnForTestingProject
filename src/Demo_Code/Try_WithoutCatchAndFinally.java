package Demo_Code;

public class Try_WithoutCatchAndFinally {

	public static void main(String[] args) {
		try
		{
			int a = 100;
			int b = 0;
			int c = a/b;
			
		}
		
		System.out.println("hello");
		
		catch(Exception e)
		{
			System.out.println("i am catch block for - try block: "+e);
		}

	}

}
