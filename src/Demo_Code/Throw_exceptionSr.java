package Demo_Code;

import java.util.Scanner;

class LessSwitchException extends RuntimeException        //inheritance
{       
	LessSwitchException(String msg)       // constructor
	{
		super (msg);                    //exception  throw the message
	}
	
}

public class Throw_exceptionSr {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the no of switch unit: ");

		int switchunit = s.nextInt();
		try {
		
		if(switchunit < 15)
		{
			throw new LessSwitchException("Less than 15 unit of swtich");
		}
		else
		{
			System.out.println("more than 15 units of switch - connection build");
		}
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
		System.out.println("rest of the program");
		
	}

}
