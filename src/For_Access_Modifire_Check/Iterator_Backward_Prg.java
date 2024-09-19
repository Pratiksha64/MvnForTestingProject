package For_Access_Modifire_Check;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Iterator_Backward_Prg {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(500);
		a1.add(700);
		a1.add("pratu");
		a1.add(null);
		
       ListIterator it = a1.listIterator();
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       System.out.println("-------reverse loop---------");
       while(it.hasPrevious())
       {
    	   System.out.println(it.previous());
       }
       
       // set iterator for backward
       
       Set s = new HashSet();
       
       s.add(10);
       s.add(20);
       s.add("sanju");
       s.add(null);
       
      Iterator itr = s.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
       
       System.out.println("----------reverse lopp--------");
       while(itr.hasPrevious())
       {
    	   System.out.println(itr.previous);
       }
	}

}
