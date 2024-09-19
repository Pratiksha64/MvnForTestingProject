package Demo_Code;

public class String_one {
	
	public static void main(String[] args) 
	{
		
		String s = "Development";
		String a = "Pratiksha ";
		String b = "Rose day";
		String d = "Pratu12@gmail.com";
		String c = "Hello";
		
		// method - 1 length
		
		System.out.println("Length.." +s.length() );
		System.out.println("Length.." +d.length() );
		
		//method concate
		
		System.out.println("adding two string : "+a.concat(b));
		
		//method trim (used to remove space)
		
		String e =" Everyone ";
		
		System.out.println("before trim :"+e);
		System.out.println("after trim :"+e.trim());
		
		// method charAT ----show index value
		
		System.out.println("charAT check index value (character place value) :"+a.charAt(3));
		System.out.println("charAT check index value (character place value) :"+a.charAt(8));
		
		// String contains--------false/true
		
		System.out.println("check wheather given script contains word :"+c.contains("llo"));
		
		//String equals ------true/false
		
		System.out.println("compare string data wih cases : "+a.equals("Pratiksha "));
		System.out.println("compare string data wih cases : "+a.equals("pratiksha "));

		
		//String EqualsignoreCase ------true/false (ignore upper and lower case)
		
				System.out.println("compare string data wih cases : "+a.equalsIgnoreCase("Pratiksha "));
				System.out.println("compare string data wih cases : "+a.equalsIgnoreCase("pratiksha "));
				
	   // method substring ----Begning no -----endex value counting(start with 0)  Ending no-----normal value counting(start with 1)
				
				String x = "Birthday";
				String z = "Journey";
				
				System.out.println("substring :" +x.substring(5,8));
				System.out.println("substring :" +z.substring(1,4));
				System.out.println("substring :" +z.substring(3));
				
        // method replace
				
				String y = "Happy Birthday";
				
				System.out.println("Replace word " +y.replace("Birthday", "Journey"));
				System.out.println("Replace single character " +y.replace("y", "i"));





	}

}
