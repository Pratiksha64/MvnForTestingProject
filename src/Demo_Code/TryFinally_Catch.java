package Demo_Code;

public class TryFinally_Catch {

	public static void main(String[] args) {

		try {
			int e=20;
			int f=2;
			int g=e/f;
			System.out.println("second try output : "+g);
		}
		finally {
			System.out.println("second try ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
