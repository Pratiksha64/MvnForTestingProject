package Demo_Code;

public class ConstStr_Demo {
	
	ConstStr_Demo()                    //constructor (has no need for access modifier and data type 
	                                   //constructor name is same as class name)
	{
		System.out.println("this is cocnstructor");
	}

	public void Abc() 
	{
		System.out.println("This is method");
	}
	public static void main(String[] args) {
		
		ConstStr_Demo c = new ConstStr_Demo();     //class name variable new(keyword and constructor name object line format)
		
		c.Abc();

	}

}
