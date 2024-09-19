package Demo_Code;

public class Array_Codes {

	public static void main(String[] args) {
		
		int age[] = new int[5];
		
		age[0] = 45;
		age[1]= 67;
		age[2]= 54;
		age[3]= 30;
		age[4]= 24;
		
		System.out.println("computing value : "+age);
		System.out.println("print with indivudual values : "+age[1]);
		System.out.println("print with indivudual values : "+age[2]);
        System.out.println("print with indivudual values : "+age[3]);
        System.out.println("print with indivudual values : "+age[4]);
        
        
        // use loop
        
        for(int i= 0; i<5; i++) {
        	System.out.println("seprate data : "+age[i]);
        }
        
        // array literal
        
        int age1[] = {45,67,54,30,24,79,98,34,25,45,21,34};
        
        for(int i=0; i<12; i++) {
        	System.out.println("seprated data 2 for array literal : "+age1[i]);
        }
        
        // length method
        int age2[] = {45,67,54,30,24,79,98,34,25,45,21,34,76,54,43,32,99};
        
        for(int i=0; i<age2.length; i++) {
        	System.out.println("unknown data using length method: "+age2[i]);
        }
        
        //default value int 0
        
        int age3[] = new int[7];
        
        age3[0] = 43;
        age3[1] =45;
        //age3[2] = 55;
        age3[3] = 78;
        age3[4] = 61;
        //age3[5] = 88;
        age3[6] = 11;
        
        for(int i=0;i<age3.length; i++) 
        {
        	System.out.println("working with default value : "+age3[i]);
        	
        }
        
        
        // default with array literal
        
        
  int age4[] = {45,67,54,30,24,79,98,34,25,45,21,34,76,54,99};
        
        for(int i=0; i<age4.length; i++) {
        	System.out.println("default value is not available: "+age4[i]);
        }
        
        // by using string method
        
        String name[] = new String[6];
        
        name[0] = "AAA";
       // name[1] = "BBB";
        name[2] = "CCC";
        name[3] = "DDD";
        //name[4] = "EEE";
        name[5] = "FFF";
        
        for(String s:name) {
        	System.out.println("string data print : " +s);
        }
        
        //array literal
        
        String name1[]= {"AAA","BBB","CCC","DDD","EEE","FFF","GGG"};
        
        for(String a:name1) {
        	System.out.println("seprate data 2 for array : "+a);
        }
        
        
        

	}

}
