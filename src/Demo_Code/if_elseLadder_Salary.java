package Demo_Code;

public class if_elseLadder_Salary {
	
	public static void main(String[] args) 
	{
		int salary=85000;
		
		if(salary<30000) 
		{
			System.out.println("Salary category :Low");
		}
		else if(salary >=30000 && salary <=70000) 
		{
			System.out.println("Salary category :Medium");
		}
		else 
		{
			System.out.println("Salary category :High");
			
		}
		
	}

}
