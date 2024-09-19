package Demo_Code;

public class ReturnandNonReturnType {

	public void Color() {
		System.out.println("color is blue");
	}
	
	public int age(int a) {
		System.out.println("the age of kid is " +a);
		return a;
	}
	public boolean condition (boolean c) {
		System.out.println("the box is empty " +c);
		return c;
	}
	public double number(double d) {
		System.out.println("the no is "+d);
		return d;
	}
	public String yogi(String f) {
		System.out.println("the string is here "+f);
		return f;
	}
	
	public static void main (String [] args) {
		ReturnandNonReturnType rr=new ReturnandNonReturnType();
		rr.Color();
		rr.age(5);
		rr.condition(true);
		rr.number(567.89888);
		rr.yogi("hey ");
		
	}
	
	
}
