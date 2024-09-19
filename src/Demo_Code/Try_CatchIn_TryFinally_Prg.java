package Demo_Code;

public class Try_CatchIn_TryFinally_Prg {

	public static void main(String[] args) {

		try {
		int a=100;
		int b= 0;
		int c=a/b;
		}
			catch(Exception e) {
				System.out.println(e);
				try {
					int[]a=new int[2];
					a[1]=100;
					System.out.println(a[1]);
				}
				finally {
					System.out.println("this is a second try finally");
				}
				}
			}

}
