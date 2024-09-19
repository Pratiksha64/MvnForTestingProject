package For_Access_Modifire_Check;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator_And_Listiterator_Sr {

	public static void main(String[] args) {

		// List Iterator forward loop
		
		ArrayList a = new ArrayList();
		a.add(100);
		a.add(200);
		a.add("pratu");
		a.add(null);
		
		System.out.println(a);
		
		Iterator it = a.iterator();
		while(it.hasNext())              // next hai ya nhi check kro aur print kro
		{
			System.out.println(it.next());
		}
		
		// Set iterator    
		
		Set s = new HashSet();
		s.add(100);
		s.add(3300);
		s.add("sanu");
		s.add(null);
		
		System.out.println(s);
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
	}

}
