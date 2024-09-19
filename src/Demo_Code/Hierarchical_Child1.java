package Demo_Code;

class Hierachi_Single_Parent {
	void Black() {
		System.out.println("the color is - black method");
	}
	}

class Child_One extends Hierachi_Single_Parent
{
	void Pink() {
		System.out.println("the color is - pink method");
	}
	
}

class Child_Two extends Hierachi_Single_Parent
{
	void Green() {
		System.out.println("the color is - green");
	}
}

public class Hierarchical_Child1 extends Hierachi_Single_Parent{
	
	void Blue()
	{
	System.out.println("the color is - blue method");	
	}

	public static void main(String[] args) {
		
		Hierarchical_Child1 a = new Hierarchical_Child1();
		a.Blue();
		a.Black();
		
		Child_One b = new Child_One();
		b.Pink();
		b.Black();
		
		Child_Two c = new Child_Two();
		c.Green();
		c.Black();
		
		
	}

}
