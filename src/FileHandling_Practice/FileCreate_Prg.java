package FileHandling_Practice;

import java.io.File;
import java.io.IOException;

public class FileCreate_Prg {

	public static void main(String[] args) /* throws IOException */ {
    
		File f = new File("e://NewFile.txt");
		try
		{
		if(f.createNewFile())
		{
			System.out.println("File is created");
			
		}
		else 
		{
			System.out.println("file is already created");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
