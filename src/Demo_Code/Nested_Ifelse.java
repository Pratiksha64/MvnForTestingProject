package Demo_Code;

public class Nested_Ifelse {
	
	public static void main(String[]args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b) {
			
			if(c<a) {
				System.out.println("Execute the first statement"); //first if and second if true then show this result
				
			}
			else 
			{
			    System.out.println("Execute the second statement");	//first if true and second if false then show this result
			}
		}
		else 
		{
			System.out.println("Execute the third statement");  //first if false then show this result
		}
	}

}
