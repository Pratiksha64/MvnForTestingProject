package Demo_Code;

public class if_elseLadder {
	
	public static void main (String[] args) {
		int age =45;
		
		if(age<18)
		{
			System.out.println("No voting rights");
			
		}
		else if(age >=18 && age <45) 
		{
			System.out.println("Ideal eligible slot for voting");
		}
		
		else if (age >=45 && age <60) 
		{
			System.out.println("Give them to priority first");
		}
		else {
			System.out.println("The voting ratio might be less");
		}
		
	}

}
