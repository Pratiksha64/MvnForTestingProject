package FileHandling_Practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Write_Prg {

	public static void main(String[] args) throws IOException {
		
		File f = new File("e://AbcFile.txt");
		f.createNewFile();
		System.out.println("File is created");
		
		// Writing data in file
		
		FileWriter fw = new FileWriter("e://AbcFile.txt");
		try {
		fw.write("The java is a programatic language");
		}
		
		finally {                         //finally mai hum jo bhi data likhate hai wo execute hota hai
			fw.close();
		}

	}

}
