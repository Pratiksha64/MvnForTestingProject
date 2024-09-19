package Demo_Code;

public class TryCatchIn_Catch {

	public static void main(String[] args) {

		try
		{
			int a = 100;
			int b = 0;
			int c = a/b;
			
		}
		catch(Exception e)
		{
			System.out.println("i am catch block for - try block: "+e);
		}
		
		System.out.println("hello");
		
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}

}
