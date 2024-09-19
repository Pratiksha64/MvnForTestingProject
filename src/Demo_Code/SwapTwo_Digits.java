package Demo_Code;

public class SwapTwo_Digits {

	public static void main(String[] args) 
	{
		
		int a = 5;
		int b = 7;
		
		System.out.println("before swapping: a =" +a + " b = " +b);
		
		a = a+b; 
		b = a-b; 
		a = a-b; 
		
		System.out.println("after swapping: a= " + a + " b = " +b);
		
	}
}
