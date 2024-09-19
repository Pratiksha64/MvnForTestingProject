package Demo_Code;

public class Try_Catch_Finally_Prg1 {

	public static void main(String[] args) {

		try                            // Exception not occured
		{
			int a=100;
			int b=2;
			int c=a/b;
			
			System.out.println(c);
			
		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		
		finally 
		{
			System.out.println("finally i am blocked here");
		}
		
		System.out.println("print rest of the programm");
	}

}
