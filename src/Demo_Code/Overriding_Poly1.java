package Demo_Code;

class Moon{                                           // method overriding
	                                                  // 1)different class 2)same method
	void Area(int a,String b) {                                     // same arguments
		System.out.println("this is a area of moon");         // no. of arguments
	}                                                         //sequence of argument(parameters)
	                                                          //types of argument
                                                             
}
	
	class Sun extends Moon{                    //inheritance says always display child first (method same hogi to bhi wo 
		                                       //child ki hi method call krega sun ki s.white()sun)
		
		void Area(int a , String b) {
			System.out.println("this is a area of sun - 1");
		}
	}


public class Overriding_Poly1 {
	
	void Area(int a , String b) {
		System.out.println("this is a area of overriding poy1- 3");
	}

	public static void main(String[] args) {
		
		Moon m = new Moon();
		m.Area(1,"hi");
		
		Sun s = new Sun();
		s.Area(2,"hello");

		
		Overriding_Poly1 a = new Overriding_Poly1();
		a.Area(3,"bye");
		
		

	}

}
