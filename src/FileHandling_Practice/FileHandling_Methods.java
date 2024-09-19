package FileHandling_Practice;

import java.io.File;
import java.io.IOException;

public class FileHandling_Methods {

	public static void main(String[] args) throws IOException {

		File f = new File("e://NewFile.txt");
		f.createNewFile();
		System.out.println("file is created");
		if(f.exists())
		{
			//System.out.println("file delete : "+f.delete());
			System.out.println("File name : "+f.getName());
			System.out.println("File Location : "+f.getAbsolutePath());
			System.out.println("File redable : "+f.canRead());
			System.out.println("File Writable : "+f.canWrite());
			System.out.println("File length : "+f.length());
			//System.out.println("File Delete : "+f.delete());
		}
		
	}

}
