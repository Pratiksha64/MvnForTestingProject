package Demo_Code;

import java.io.FileInputStream;

public class Try_Catch_Finally_Finally_Prg {

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
			finally
			{
				System.out.println("i am finally for - try block");
			}
			
			finally
			{
				System.out.println("i am main finally");
			}
		}


	}

}
