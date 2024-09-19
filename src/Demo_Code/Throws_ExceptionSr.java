package Demo_Code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_ExceptionSr {
	
	void FileRead() throws FileNotFoundException
	{
    FileInputStream f = new FileInputStream("e://Abc.txt");    // put in my files present hogi to dikhegi nhi to error show hoga
		System.out.println("file is found");
	} 


	public static void main(String[] args) throws FileNotFoundException {
		
		Throws_ExceptionSr t = new Throws_ExceptionSr();

		try {
		
		t.FileRead();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
