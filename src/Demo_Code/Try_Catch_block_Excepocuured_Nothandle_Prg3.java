package Demo_Code;

public class Try_Catch_block_Excepocuured_Nothandle_Prg3 {

	public static void main(String[] args) {
		
		try                        // Exception occured but not handle
		{
			int a = 100;
			int b = 0;
			int c = a/b;
		
			System.out.println(c);        //risky code
		}

//		catch(Exception e)
//		{                                //exception not handle
//			System.out.println(e);
//		}
		finally
		{
			System.out.println("finally i am blocked");   //finally executed
		}
		
		System.out.println("hello world");                   //rest of the code not executed when exception is not handle
	}

}
