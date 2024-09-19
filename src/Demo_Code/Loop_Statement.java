package Demo_Code;

public class Loop_Statement {
	
	public static void main (String[] args) 
	{
		
		 for(int i=1;i<=200;i++) { System.out.println("Hello world"+i); }
		
		
		for (int i=100; i>=1; i--) {
			System.out.println("Decrement "+i);  //Decrement largest no to samllest no sign indicates greater than first no is always greater and second is smaller
		}
		
		for (int i=-100; i<=-1; i++) {
			System.out.println("Increment "+i);   //Increment smallest no to largest no sign indicates smaller than first no is always smaller and second is larger
		}
		
		for(int i=-1; i>=-100; i--) {
			System.out.println("Decrement "+i);   //-1 is greater and -100 is smaller no (larger no to smaller no)
		}
		
	}

}
