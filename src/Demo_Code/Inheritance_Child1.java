package Demo_Code;

class Parent_All             // super class
{
	void Black()                     //method
	{
		System.out.println("parent class and black method");
	}
	
	void Black1()
	{
		System.out.println("parent class - balck1 method");
		
	}
}



public class Inheritance_Child1 extends Parent_All  // subclass
{
	    void White() {
		System.out.println("child class  - white method");
		}
	
  public static void main(String[] args) {
	  
	  Inheritance_Child1 a = new Inheritance_Child1();
	  a.White();
	  a.Black();
	  a.Black1();
	  
	 // Parent_All p = new Parent_All();
	 // p.Black();
	  

	}

}
