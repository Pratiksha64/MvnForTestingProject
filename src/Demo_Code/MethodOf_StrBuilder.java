package Demo_Code;

public class MethodOf_StrBuilder {
	
	public static void main(String[] args)
	{
		//method l length 
		
		StringBuilder sb = new StringBuilder("Hello Everyone");
		System.out.println("length :"+sb.length());
		
		// method 2 delete
		
		StringBuilder sb1= new StringBuilder("Hello To Everyone"); //Hello Everyone
		System.out.println("Delete :"+sb1.delete(5, 8));
		System.out.println("Delete : "+sb1.delete(6, 11));
		
		//method insert 
		
		StringBuilder sb2 = new StringBuilder("Hello Everyone");
		System.out.println("insert : "+sb2.insert(6, "To "));
		
		// method replace 
		
		StringBuilder sb3 = new StringBuilder("Hello Everyone");
		System.out.println("Replace : "+sb3.replace(6, 14, "World"));
		
		//method DeleteCharAt
		StringBuilder sb4 = new StringBuilder("Hello Everyone");
		System.out.println("Delete single character : "+sb4.deleteCharAt(8));

		
		
		
	}

}
