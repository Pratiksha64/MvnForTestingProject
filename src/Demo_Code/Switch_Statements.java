package Demo_Code;

public class Switch_Statements {
	
	public static void main(String[] args) {
		
		String day ="C";
		switch(day)
		{
			case "A":
				System.out.println("Monday");
				break;
			
			case "B":
				System.out.println("Tuesday");
				break;
				
			case "C":
				System.out.println("Wednesday");
				break;
				
			case "D":
				System.out.println("Thursday");
				break;
				
			case "E":
				System.out.println("Friday");
				break;
				
			case "F":
				System.out.println("Saturday");
				break;
				
				default:
					System.out.println("Week of day");
		}
	}

}
