package Demo_Code;

class Private_Modifier1{        // private method -- which works inside same class do not allow 
	                            // its method execute in another class (private method single class mai perform ki jati hai )
	
	private void Black() {
		System.out.println("the method is - black");
	}
}

public class Private_Modifier {
	
	private void Purple() {
		System.out.println("the method is - purple");
	}
	

	public static void main(String[] args) {
		
		Private_Modifier p = new Private_Modifier();
		p.Purple();
		
		Private_Modifier1 e = new Private_Modifier1();
		//e.

	}

}
