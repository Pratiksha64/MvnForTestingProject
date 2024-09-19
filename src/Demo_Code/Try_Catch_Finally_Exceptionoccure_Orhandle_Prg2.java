package Demo_Code;

public class Try_Catch_Finally_Exceptionoccure_Orhandle_Prg2 {

	public static void main(String[] args) {
		
		try                        // Exception occured and handle
		{
			int a = 100;
			int b = 0;
			int c = a/b;           // risky code
			
			System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println(e);            //exception handle
		}

		finally 
		{
			System.out.println("hello world");       //finally execute
		}
		System.out.println("hi engila");
	}

}
