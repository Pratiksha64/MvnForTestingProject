
package Demo_Code;

public class Overloading_Poly3 {                              //method overloading
	                                                          //1)same class 2)same method
	void Pink(int a) {                                             //different argument
		System.out.println("the method is pink - 1 "+a);         // * types of argument
	}
	
	void Pink(String b) {
		System.out.println("the method is pink - 2 "+b);
	}

	public static void main(String[] args) {
		
		Overloading_Poly3 k =new Overloading_Poly3();
		k.Pink(55);
		k.Pink("Pratu");

	}

}
