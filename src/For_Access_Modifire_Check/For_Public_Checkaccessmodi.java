package For_Access_Modifire_Check;
import Demo_Code.Public_Class_One;

public class For_Public_Checkaccessmodi //extends  Public_Class_One
{

	public static void main(String[] args) {

		//For_Public_Checkaccessmodi a = new For_Public_Checkaccessmodi();
		//a.Pari();
		
		Public_Class_One s = new Public_Class_One();   //without using subclass ---- creating object previous class in new class
		                                               // (for public access modifire)
		s.Pari();
	}

}
