package FileHandling_Practice;

import java.io.FileReader;
import java.io.IOException;

public class FileRead_Sr {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("e://AbcFile.txt");
		try
		{
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		}
		finally         //hum finally isliye yaha pe use krte hai because file up open krte 
		                //hai to close krana mandatory hai nho to data currupt ho sakta hai multiple 
		               //file open krke isliye hum finally ka use krte hai
		{
			fr.close();
		}
	}

}

