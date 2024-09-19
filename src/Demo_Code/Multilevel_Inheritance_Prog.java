package Demo_Code;

class Multi_Main{
	
	void Word_Grandfather() {
		System.out.println("The grandfather is a superclass of father - aa ");   
	}
}

class Multi_One extends Multi_Main{
	void Word_Father() {
		System.out.println("the father is a superclass of child - and subclass of grandfather");  //(grandfather ki property father access krta hai)
	}
	
}

public class Multilevel_Inheritance_Prog extends Multi_One {
	
	void Child() {
		System.out.println("child is a subclass of father");  //(father ki property access child krta hai)
	}

	public static void main(String[] args) {
		
		Multi_Main a = new Multi_Main();
		a.Word_Grandfather();
		
		Multi_One b = new Multi_One();
		b.Word_Grandfather();
		b.Word_Father();
		
		Multilevel_Inheritance_Prog c = new Multilevel_Inheritance_Prog();
	    c.Word_Grandfather();
	    c.Word_Father();
	    c.Child();
		
		
		
		
		
		
		

	}

}
