package Demo_Code;

import java.io.FileInputStream;

public class Try_Catch_Within_Try_Catch_Prg {

	public static void main(String[] args) {

		try {
			
		
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
		finally
		{
			System.out.println("i am finally for - try block");
		}
		
		FileInputStream f = new FileInputStream("d:abc.txt");
		
		}
		catch(Exception e)
		{
			System.out.println("i am main catch : "+e);
		}
		finally
		{
			System.out.println("i am main finally");
		}
		System.out.println("rest of the programm");
	}

}
