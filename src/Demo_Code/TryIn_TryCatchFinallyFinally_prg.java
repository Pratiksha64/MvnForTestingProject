package Demo_Code;

import java.io.FileInputStream;

public class TryIn_TryCatchFinallyFinally_prg {

	public static void main(String[] args) {

		try {
			
			FileInputStream f = new FileInputStream("d:abc.txt");
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

	
	


