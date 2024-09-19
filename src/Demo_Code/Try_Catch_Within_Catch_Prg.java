package Demo_Code;

import java.io.FileInputStream;

public class Try_Catch_Within_Catch_Prg {

	public static void main(String[] args) {

		try
		{
			int a = 100;
			int b = 0;
			int c = a/b;
		}
		catch(Exception e)
		{
			System.out.println("i am main catch "+e);
			
			try
			{
				int []a = new int[2];
				a[5] = 100;
				System.out.println(a[5]);
			}
			catch(Exception e1) 
			{
				System.out.println("i am catch block - for catch sub"+e1);
			}
			finally
			{
				System.out.println("i am catch block for finaaly - catch sub");
			}
		}
		finally
		{
			System.out.println("i am main finally");
		}
		
		System.out.println("rest of the code");
	}

}
