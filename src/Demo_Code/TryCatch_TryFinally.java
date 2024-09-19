package Demo_Code;

public class TryCatch_TryFinally {

	public static void main(String[] args) {

		try
		{
			int a=20;
			int b=0;
			int c=a/b;
		
		}
		catch(Exception e)
		{
			System.out.println("first try exception "+e);
		}
		try {
			int e=20;
			int f=2;
			int g=e/f;
			System.out.println("second try output : "+g);
		}
		finally {
			System.out.println("second try ");
		}
	}

}
