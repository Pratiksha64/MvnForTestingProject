package Demo_Code;

import java.io.FileInputStream;

public class Checked_Exceptionsr {

	public static void main(String[] args) {

		FileInputStream a = new FileInputStream("e:/Abc.txt");  // complile time exception (checked)
	}

}
