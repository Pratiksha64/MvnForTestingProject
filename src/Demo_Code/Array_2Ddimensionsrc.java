package Demo_Code;

public class Array_2Ddimensionsrc {

	public static void main(String[] args) {

//		int[]a,b;      // ----------a --- 1d / b----1d
//		
//		int a1[],b1;   //-----------a1 -- 1d / b -- normal variable
//		
//		int[][] a2,b2; //-----------a2 --- 2d / b2 -- 2d
//		
//		int[] a3[],b3; //-----------a3 ---2d / b3 -- 1d
//		
//		int[] a4[],b4[]; //----------a4 ---2d / b4 -- 2d
//		
//		int[][] a5,b5[]; //----------a5 ---2d / b5 -- 3d
		
		//int[][] []a6,[]b6; //---------a6 ---3d / b6 -- compile run error (second b6 square bracket not to be start)
		
		System.out.println("----------matrix array----------------");
		int[][]a = new int[2][3];
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		
		System.out.println(a[0][2]);
		System.out.println("matrix array - length of row "+a.length);
		System.out.println("matrix array - length of column "+a[0].length);
		
		
		System.out.println("--------jagged array------------");
		
		int[][]b = new int[2][];    //----row length
		b[0] = new int[3];          // ---- column length
		b[1] = new int[2];          //------column length
		
		b[0][0] = 100;
		b[0][1] = 200;
		b[0][2] = 300;
		b[1][0] = 400;
		b[1][1] = 500;
		
	    System.out.println(b[0][2]);
		System.out.println("jagged array - length of row "+b.length);
		System.out.println("jagged array - length of column "+b[0].length);
		System.out.println("jagged array -length of second column "+b[1].length);
		
		System.out.println("----------matrix array literal----------------");
		                                              //     c0 c1 c2
		int[][]c = {{10,20,30},{40,50,60}};           //r0 = 10,20,30  -----1st row
		                                              //r1 = 40,50,60   -----2nd row
		
		System.out.println(c[0][0]);
		System.out.println(c[1][2]);
		System.out.println("matrix array - length of row "+c.length);
		System.out.println("matrix array - length of column of row 0 : "+c[0].length);
		System.out.println("matrix array - length of column of row 1 : "+c[1].length);
		
		
		System.out.println("----------jagged array literal----------------");
                                                                        //     c0 c1 c2 c3 c4
        int[][]d = {{10,20,30,40,50},{60,70,80},{90,100}};              //r0 = 10,20,30,40,50  -----1st row
                                                                        //r1 = 60,70,80   -----2nd row
                                                                        //r2 = 90,100     -----3rd row
        // Print specific elements
        System.out.println("Element at row 0, column 0: " + d[0][0]);
        System.out.println("Element at row 1, column 2: " + d[1][2]);
        System.out.println("Element at row 2, column 1: " + d[2][1]);

        // Print the dimensions of the jagged array
        System.out.println("Jagged array - length of row: " + d.length);
        System.out.println("Jagged array - length of columns in row 0: " + d[0].length);
        System.out.println("Jagged array - length of columns in row 1: " + d[1].length);   
        System.out.println("jagged array - length of columns in row 2: " + d[2].length);
		
        
        System.out.println("----------matrix loop in 2d ----------------");
        
        int[][]e = {{10,20,30,40},{40,50,60,70}};
        
        for(int i=0; i<e.length; i++)          //row
        {
        	 
        	for(int j=0; j<e[i].length; j++)  //column(column depend on row thats why j<e[i])
        	{
        		
        		System.out.print(e[i][j] + " | ");
        	}
        	System.out.println();
        }
        
        System.out.println("---------- jagged loop in 2d ----------------");
        
        int[][]f = {{10,20,30},{40,60,70,80,90}};
        
        for(int i=0;i<f.length; i++)
        {
        	for(int j=0; j<f[i].length; j++)
        	{
        		System.out.print(f[i][j] + " | ");     
        	}
        	
        	System.out.println();         // println means next line
        	
        }

        
	}

}
