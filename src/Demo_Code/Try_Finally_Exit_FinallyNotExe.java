package Demo_Code;

public class Try_Finally_Exit_FinallyNotExe {

	public static void main(String[] args) {

		try                        // Exception occured or handle
		{
			System.out.println(10/2);
			System.exit(0);                //terminate abnormaly (rest of the programm not run in case finally not executed)
			System.out.println(20/2);
			int a = 100;
			int b = 0;
			int c = a/b;
		
			System.out.println(c);        //risky code
		}

		catch(Exception e)
		{                                //exception  handle
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally i am blocked");   //finally executed
		}
		
		System.out.println("hello world");   
	}

}
