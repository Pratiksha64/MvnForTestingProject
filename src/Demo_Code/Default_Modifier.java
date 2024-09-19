package Demo_Code;

class Dfault_One{                              //default modifier 
	                                           //within class and the package (different class) is worked
	void One() {
		System.out.println("the method is one");
	}
	
}

public class Default_Modifier {
	void Two() {
		System.out.println("The method is two");
	}

	public static void main(String[] args) {
		
		Dfault_One o = new Dfault_One();
		o.One();
		
		Default_Modifier m= new Default_Modifier();
		m.Two();

	}

}
