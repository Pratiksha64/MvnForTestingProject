package collection_Prg;

import java.util.ArrayList;
import java.util.HashMap;

public class Colection_Two_Prg {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println("the list of 1st object"+al);
		
		ArrayList al2 = new ArrayList();
		
		al2.add("AA");
		al2.add("BB");
		
		System.out.println("the list of second object "+al2);
		
//		al.add(al2);
//		System.out.println("add method "+al);
		
		al.addAll(al2);        //data merged -- two variable data added
		System.out.println("first variable we add all data " +al);
		System.out.println("the impact for second variable"+al2);
		
		ArrayList al3 = new ArrayList();               // between two contains data match 
		
		al3.add(400);
		al3.add(500);
		al3.add(600);
		//var n =al3.contains(100);    (we can also stored in method variable)
		
		System.out.println("object contains in list  "+al3.contains(100));
		System.out.println("object contains in list "+al3.contains(500));
		
		ArrayList al4 = new ArrayList();
		
		//al4.add("Eliyana");
		//al4.add("Pratu");
		al4.add(400);
		al4.add(500);
		al4.add(600);
		
		System.out.println("check al3 and al4 remains same or not :" +al3.containsAll(al4));
		System.out.println("its the place available : "+al4.isEmpty());
		
        ArrayList al5 = new ArrayList();       //clear method //space available or not mehod
		
        al5.add("Eliyana");
        al5.add("Pratu");
        al5.add(400);
        al5.add(500);
        al5.add(600);
        
        al5.clear();
        System.out.println("clear data "+al5);
        
        System.out.println("its the place available : "+al5.isEmpty());
        
        ArrayList al6 = new ArrayList();       //remove
		
        al6.add("Sanju");
        al6.add("Mahi");
        al6.add(400);
        al6.add(900);
        
        System.out.println("Data before removal : "+al6);
        System.out.println("remove data : "+al6.remove(1));
        System.out.println("Data after removal : "+al6);
        
        
        HashMap m = new HashMap();
        m.put(100, "AAA");
        m.put(200, "BBB");
        
        System.out.println("HashMap data " +m);
        
        m.remove(100);           //we consider key for value (eg. 100)
       // m.remove(200);
        System.out.println("method is remove : "+m.remove(200));
        System.out.println("hashmap data remove "+m);
        
        
        ArrayList al7 = new ArrayList();       //remove all
		
        al7.add("Rutu");
        al7.add("aaru");
        al7.add("Sonal");
        al7.add("Sarita");
        
        System.out.println("Data before removal : "+al7);
        
        
        ArrayList al8 = new ArrayList();       //remove all
		
        al8.add(500);
        al8.add(800);
        al8.add(400);
        al8.add(900);
        
       
        al7.removeAll(al8);
        System.out.println("first variable we remove all data  : "+al7);
        System.out.println("there is no impact for second al8: "+al8);
        
        ArrayList al9 = new ArrayList();       //size length calculate
		
        al9.add(50);
        al9.add(80);
        al9.add(40);
        al9.add(90);
        
        System.out.println("Data size length : "+al9.size());
       
		
	}
	

}
