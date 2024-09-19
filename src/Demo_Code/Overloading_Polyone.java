package Demo_Code;

public class Overloading_Polyone {                              //method overloading
	                                                    
	void Black()                                                // 1) same class 2) same method
	{
		System.out.println("this method is balck - one");       // different parameters
	}
                                                                // * no arguments (one method no arguments show)
	void Black(String a) 
	{
		System.out.println("this method is black - 2"+ a);
	}
	public static void main(String[] args) {
		
		Overloading_Polyone p = new Overloading_Polyone();
		
		p.Black();
		p.Black("hello");

	}
	
	}


