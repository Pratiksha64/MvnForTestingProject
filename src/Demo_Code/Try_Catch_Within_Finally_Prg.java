package Demo_Code;

public class Try_Catch_Within_Finally_Prg {

	public static void main(String[] args) {
     try
     {
    	 int a = 100;
    	 int b = 0;
    	 int c = a/b;
     }
     catch(Exception e)
     {
    	 System.out.println("this is main catch : "+e);
     }
     finally {
    	 System.out.println("this is main finally");
    	 
    	 try
    	 {
    		 int []a = new int[2];
    		 a[5]=100;
    		 System.out.println(a[5]);
    	 }
    		 
    	 
    	 catch(Exception e) {
    	  System.out.println("this is catch for - finally" +e);
    	 }
      finally
     {
    	 System.out.println("this is finally for sub try");
     }
    	 System.out.println("rest of the code");
     
	}
	}
}


