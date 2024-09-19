package Demo_Code;

public class StaticVariableSr {
	
	static int age;
	static String name;
	
	public static void method() {
		
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
	}

	public static void main(String[] args) {
		
		age = 21;
		name = "Pratu";
		method();

	}

}
