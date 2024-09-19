package For_Access_Modifire_Check;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List_Set_sr {

	public static void main(String[] args) {
		
		HashSet s = new HashSet();
		s.add(37);
		s.add("pratu");
		
		System.out.println(s);
		
		ArrayList al = new ArrayList();     //object line
		List l = new ArrayList();           // reference object line -- interface properties are implemented through class
		
		//HashSet h = new HashSet();
   		Set s1 = new HashSet();
   		
   		// List allows duplicate values
   		
   		ArrayList al2 = new ArrayList();
   		al2.add(500);
   		System.out.println("duplicate value : "+al2.add(500));
   		System.out.println(al2);
   		
   		// List allowed null value
   		
   		ArrayList al3 = new ArrayList();
   		al3.add(null);
   		System.out.println("null value : "+al3.add(null));
   		System.out.println(al3);
		
   		// set do not allowed duplicate value
   		
   		HashSet h = new HashSet();
   		h.add(100);
   		System.out.println(h.add(100));
   		System.out.println(h);
   		
   		// set do not allowed duplicate null value
   		
   		HashSet h1 = new HashSet();
   		h1.add(null);
   		System.out.println(h1.add(null));
   		System.out.println(h1);
   		
   		//List follows insertion order (first show index value data then other)
   		
   		ArrayList al4 = new ArrayList();
   		al4.add(100);
   		al4.add(500);
   		al4.add(80);
   		al4.add(900);
   		
   		al4.add(0,50);
   		al4.add(1,70);
   		al4.add(2,10);
   		al4.add(3,64);
   		System.out.println(al4);
   		
   		
   		//Set does not folllow insertion order
   		
   		Set t = new TreeSet();
   		
   		t.add(500);
   		t.add(10);
   		t.add(80);
   		t.add(700);
   		t.add(800);
   		
   		System.out.println(t);
   		
   		TreeSet t1 = new TreeSet();
   		t1.add("BB");
   		t1.add("CC");
   		t1.add("AA");
   		t1.add("MM");
   		
   		System.out.println(t1);
   		
   		

	}

}
