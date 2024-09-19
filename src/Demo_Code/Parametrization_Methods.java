package Demo_Code;

public class Parametrization_Methods {
	
	int age;            // instance variable saglya methods chya baher call krto
	
	public void userinfo(String name,int age,long mobile, double salary) //use void all data type include in parameters
	{
		System.out.println(name+" "+age+" "+mobile+" "+salary);
	}
	
	/*
	 * public void userdefined() { String name = "Pratiksha"; int age = 24; long
	 * mobile = 914667298; double salary = 25000.25;
	 * 
	 * String name1 = "Sam"; int age1 = 25; long mobile1 = 888867298; double salary1
	 * = 29000.25;
	 * 
	 * System.out.println(name+age+mobile+salary); }
	 */
	
	public int addition(int a,int b,int c)   // create object
	{
		int e = a+c;
		System.out.println("additon " +e);
		return e;
		
	}
	
	public static int subtraction(int a,int b)   // while we use static then object is not created 
	{
		int c=b-a;
		System.out.println("subtraction "+c);
		return c;
	}

	public static void main(String[] args) 
	{
		Parametrization_Methods m = new Parametrization_Methods();    // object (class name variable(m) new class name)
		m.userinfo("Akshay", 28, 67326876, 36789.98);
		m.userinfo("Sam", 43, 545645676, 6799.87);
		
		m.addition(20, 30, 40);
		m.addition(100, 200, 300);
		m.addition(10, 20, 30);
		
		subtraction(40, 20);
		subtraction(80, 50);
		subtraction(20, 10);
		
	}
}
