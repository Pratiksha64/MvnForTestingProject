package Demo_Code;

public class swapTwo_DigitsWithThirdVariable {
	
	public static void main (String[] args) 
	{
		int a = 5;
		int b = 7;
		
		System.out.println("before swapping: a = " + a + " b = " + b);
		
		int c=a;
		
		a = b;
		b = c;
		
        System.out.println("After swapping: a = " + a + ", b = " + b);

		
	}

}
