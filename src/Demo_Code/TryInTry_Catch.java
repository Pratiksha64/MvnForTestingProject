package Demo_Code;

public class TryInTry_Catch {

	public static void main(String[] args) {
    
		try
		{
			int a=20;
			int b=0;
			int c=a/b;
		try {
			int d=20;
			int e=4;
			int f=d/e;
		}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
