package JavaWithNaveen;

public class StaticArray {

	public static void main(String[] args) {
		
//Array:- to store similar data type in a array variable
// Disadvantage of array : 
//1. size is fixed "static array",-- to over come it use Collect :- arraylist, hashtag, :- use dynamic array
// 2. store similar data type  :- to overcome it : we use object array
		
		System.out.println("****1. Int array****");
		
	int a[] = new int [5];
	 a[0] = 2;     // lower bound index :0 
	 a[1] = 5;
	 a[2] = 10;
	 a[3] = 15;
	 a[4] = 20;     // upper bound index : n-1: 5-1 = 4 here
	
	System.out.println(a[3]);
	System.out.println(a.length + " length of array");
	
	// print all value of array using loop
	
	for (int b=0; b<a.length; b++)
	{
		System.out.println(a[b]);
	}
		
		System.out.println("****2. double array****");
	double d[] = new double[2];
	d[0] = 1.1;
	d[1] = 2.2;
	
	System.out.println(d[1]);
		
	System.out.println("***3. char array****");
    
	char c[]= new char[3];
	c[0]= 'M'; 
	c[1]= 'F';
	c[2]= 'O';
	
	System.out.println(c[1]);
		
	System.out.println("****4. booleen array****");
	
	boolean bo[]= new boolean[2];
	bo[0]= true;
	bo[1]= false;
	
	System.out.println(bo[1]);
	
	System.out.println("****5. string array****");	
	
	String s[]= new String [3];
	s[0]= "Hello";
	s[1] = "World";
	s[2] = "London" ;
	
			System.out.println(s[2]);
		System.out.println(s.length);

		
		System.out.println("****6. Object array****");	
			
		Object ob[] = new Object [5];
		ob[0]= "Ayushi" ;
		ob[1]= 26.4;
		ob[2]= "10/5/1995";
		ob[3]= 'F';
		ob[4]=  "Uttrakhand" ;
		
	//	System.out.println(ob[0]+ob[1]+ob[2]+ob[3]+ob[4]);
		
		System.out.println(ob[4]);
				
		
		
		
		
		
	}

}
