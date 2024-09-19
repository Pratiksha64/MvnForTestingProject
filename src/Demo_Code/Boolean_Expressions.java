package Demo_Code;

public class Boolean_Expressions {
	public static void main (String[] args) {
		
		int a=50;
		int b=50;
		int c=30;
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("And-----------&&-----Or--------||");
		
		System.out.println(a>b && b>c);  //false
		System.out.println(a>=b && b>c);  //true
		System.out.println(a>b ||b>c);    //true
		System.out.println(a>=b || b>c);  //true
		System.out.println(a>b != b>c);    //true
		
		
		System.out.println("data types syntax");
		
		char name ='a';
		int n =1234567890; //allowed only 10 numbers
		String s ="Arya";
		boolean b1 =true;
		boolean b2 =false;
		byte w =124;       //-128 to127 no allowed
		short e =12345;    //5 digits allowed
		long l =1234567891245678912l;  //19 digits are allowed with l
		float f =1234.676768f;
		double d =657.67687867;
		
		
		
	}
	

	

}
