package Demo_Code;

class Protected_One{            // protected says -- which works inside and outside class with 
	                            // same package and another package
	protected void Rainbow() {
		System.out.println("the method is rainbow");
	}
}

public class Protected_Class {
	
	protected void colors() {
		System.out.println("This methos is colors");
	}

	public static void main(String[] args) {
		
		Protected_One p = new Protected_One();
		p.Rainbow();
		
		Protected_Class c = new Protected_Class();
		c.colors();

	}

}
