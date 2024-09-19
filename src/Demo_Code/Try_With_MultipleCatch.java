package Demo_Code;

public class Try_With_MultipleCatch {

	public static void main(String[] args) {

		try                        // Exception occured or handle
		{
		    int a = 100;
			int b = 0;
			int c = a/b;
		
			System.out.println(c);        //risky code
		}

//		catch(ArithmeticException e)
//		{                                                                //exception  handle
//			System.out.println("arithmetic child exception class "+e);
//		}
		catch(ArrayIndexOutOfBoundsException e)
		{                                                                 //exception  handle child
			System.out.println("array child exception class "+e);
		}
		catch(Exception e)
		{
			System.out.println("parent exception class "+e);   //parent handle
		}
		finally
		{
			System.out.println("finally i am blocked");   //finally executed
		}
		
		System.out.println("hello world");  
	}

}
