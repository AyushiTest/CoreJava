package JavaWithNaveen;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);  //0
		ar.add(200); //1
		System.out.println(ar.size());
		
		ar.add(300); //2
		ar.add("hello"); //3
		ar.add("m"); //4
		ar.add("maa"); //5
		
		System.out.println(ar.size());
		ar.remove(5);
		System.out.println(ar.size());
		
		
		System.out.println(ar.get(4));
		
		ar.add(10.05); // 5
		
		
		// Print all values of array list
		for (int i=0; i<ar.size(); i++) {
			System.out.println(i);
		}

		
		ArrayList <Integer> ar1 = new ArrayList <Integer>();
		ar1.add(100);
	//	ar1("sem");
				
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
