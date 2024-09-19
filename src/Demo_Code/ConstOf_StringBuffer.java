package Demo_Code;

public class ConstOf_StringBuffer {
	
	public static void main (String[] args)
	{
		
	// default constructor------ default capacity -----16
		
	 StringBuffer sb = new StringBuffer();
	 System.out.println("default capaity of stringbuffer "+sb.capacity());
	 
	 //string constructor -------input capacity of string
	 
	 StringBuffer sb1 =new StringBuffer("welcome");
	 System.out.println("string capacity "+sb1.capacity());
	 
	 StringBuffer sb2 =new StringBuffer("welcome to home");
	 System.out.println("string capacity "+sb2.capacity());
	 
	 // int constructor -------create capacity as per user define length
	 
	 StringBuffer sb3 = new StringBuffer(100);
	 System.out.println("int capacity created" +sb3.capacity());
	 
	 
	 
	 
	 
	}

}
