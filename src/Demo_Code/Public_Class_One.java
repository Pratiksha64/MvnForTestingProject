package Demo_Code;

class Angle{                // public - which works inside and outside class with same package
	                        //and another package with and without subclass(extends keyword)
	
	public void Barbie() {
		System.out.println("the method is barbie");
	}
}

public class Public_Class_One {
	
	public void Pari() {
		System.out.println("The method is pari");
	}
	
	public static void main(String[] args) {
		
		Angle a = new Angle();
		a.Barbie();
		
		Public_Class_One s = new Public_Class_One();
		s.Pari();

	}

}
