package collection_Prg;

import java.util.ArrayList;

public class Collection_One_Sc {
	void num()
	{
	int a = 100 , b = 200;
	int c = a+b;
	System.out.println("num method : "+c);
	}


	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0] = 10;
		a[1] =20;
		a[2]=30;
		a[3]=40;
		
		for(int i=0; i<4; i++)
		{
			System.out.println(a[i]);
		}
		
		Collection_One_Sc cl = new Collection_One_Sc();
		cl.num();
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Hello");
		al.add(28.999);
		al.add(123456789);
		
		System.out.println(al);

	}

}
