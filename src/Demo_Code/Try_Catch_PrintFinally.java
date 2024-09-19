package Demo_Code;

public class Try_Catch_PrintFinally {

	public static void main(String[] args) {

		try
		{
			int a = 100;
			int b = 0;
			int c = a/b;
			
		}
		catch(Exception e)
		{
			System.out.println("i am catch block for - try block: "+e);
		}
		
		System.out.println("hello");
		
		finally
		{
			System.out.println("final output");
		}
	}

}
