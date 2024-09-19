package Demo_Code;

public class Overloading_Poly2 {                             //method overloading
	                                                         //1)same method name 2)same class
	void White(int a, String b) {                            //different arguments 
		System.out.println("this is method white -1 : "+a+" "+b);       // *sequence of argument         
	}
	
	void White(String a , int b) {
		System.out.println("this is method white - 2 : "+a+" "+b);
	}
	
   public static void main(String[] args) {

	   Overloading_Poly2 d = new Overloading_Poly2();
	   
	   d.White(10, "hi");
	   d.White("hello", 88);
	}

}
