package Demo_Code;

public class First_Programm {
	
	public void pink() //method
	{
		System.out.println("print pink");
		
	}
	public void Moon() //method
	{
		
		System.out.println("print moon");        //syso cltr+space
	}
	
	public void red() //method
	{
		System.out.println("print red");
	}
	
	public static void main (String args[])    //main method
	{
		First_Programm m=new First_Programm(); //object creation
		m.pink();
		m.Moon();                               //calling data from above method
		m.red();
		//System.out.println("print the given mail -----ABC@gmail.com");
	}

}
