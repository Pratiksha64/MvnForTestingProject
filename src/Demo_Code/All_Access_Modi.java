package Demo_Code;

class All_Data{
	
	public void One() {
		System.out.println("this method is - one - public");
	}
	void Two() {
		System.out.println("this method is - two - default");
	}
	
	protected void Three() {
		System.out.println("this method is - three - Three");
	}
	
	/*
	 * private void Four() { System.out.println("this method is - four - private"); //private using only one class
	 * }
	 */
	
}

public class All_Access_Modi {
	
	public void Five() {
		System.out.println("this method is - five - public");
	}
	void Six() {
		System.out.println("this method is - six - default");
	}
	
	protected void seven() {
		System.out.println("this method is - seven - protected");
	}
	
	private void Eight() {
		System.out.println("this method is - eight - private");
	}

	public static void main(String[] args) {
		
		All_Data a = new All_Data();
		a.One();
		a.Two();
		a.Three();
		//a.Four();
		
		All_Access_Modi b = new All_Access_Modi();
		b.Five();
		b.Six();
		b.seven();
		b.Eight();

	}

}
