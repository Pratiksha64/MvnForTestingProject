package Demo_Code;

import java.io.FileInputStream;

public class Try_Catch_Prg_One {

	public static void main(String[] args) {

		try
		{
		FileInputStream a = new FileInputStream("d:/Abc.txt");   // risky method (try ke andar riski method hoti hai)
		}
		catch(Exception e)                                  // catch exception handle krta hai
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("the next method is print");
	}

}
