package For_Access_Modifire_Check;
import Demo_Code.Protected_Class;    //---- .* --- this will run all classes through import from different package

public class For_Check_Which_Accessmodi_Works extends Protected_Class{  // extend using subclass

	public static void main(String[] args) {

		For_Check_Which_Accessmodi_Works f = new For_Check_Which_Accessmodi_Works();
		
		f.colors();        // only public class data is visible eg.Protected_Class this class (using subclass)
	}

}
