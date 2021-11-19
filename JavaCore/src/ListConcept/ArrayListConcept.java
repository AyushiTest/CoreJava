package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int [4];   //Static Array
		
		//Dnamic Array == Array List
        // 1. Array List can contains dublicates Values/elements.
		// 2.  Maintain Insertion Order.
		// 3. Synchronized.
		// 4. Allow Random access to fetch the elements bcz its stores the value of basis of indexes.
		
		
		
		ArrayList ar = new ArrayList ();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		ar.add(500);
		
		System.out.println(ar.size());   // size of array
		
		System.out.println(ar.get(2));   // to get the value from the index
		
		// To print all the values from the arraylist 
		// 1. For loop
		// 2. using iterator
		
		
		for (int i= 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// non generic vs generic 
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(111);
		// ar1.add("shimbha");
		
		ArrayList<E> ar2 = new ArrayList<E>();
		
		// employee class object 
		
		Employee e1 = new Employee("Shiva", 32, "QA");
		Employee e2 = new Employee("Kinnu", 2, "child");
		Employee e3 = new Employee("Aman", 32, "buisness");
		
		// create array list 
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
	    ar4.add(e1);
	    ar4.add(e2);
	    ar4.add(e3);
	    
	    
	    System.out.println("****iterator ****");
	    // iterator to traverse the value
	    Iterator<Employee> it = ar4.iterator();
	    while (it.hasNext()) {
	    	Employee emp = it.next();
	    	System.out.println(emp.name);
	    	System.out.println(emp.age);
	    	System.out.println(emp.dep);
	    	
	    }	
	    	  System.out.println("***add all*****"); 	
	    	
	    	
	    //addall()   : when want to add two object together
	    	  
	    ArrayList ar5 = new ArrayList();
	    ar5.add("Tester");
	    ar5.add("People");
	    ar5.add("shiva");
	    	
	    ArrayList ar6 = new ArrayList();
	    ar6.add("Team");
	    ar6.add("Public");
	    ar6.add("same");	
	    
	    ar5.addAll(ar6);
	    
	    for(int i = 0; i<ar5.size(); i++) {
	    	System.out.println(ar5.get(i));
	    }
	    System.out.println("*****Remove all****");
	    
	    // removeall : when wants to remove all values from added 
	    
	    ArrayList ar7 = new ArrayList();
	    ar7.add("Tester");
	    ar7.add("People");
	    ar7.add("shiva");
	    	
	    ArrayList ar8 = new ArrayList();
	    ar8.add("Team");
	    ar8.add("Public");
	    ar8.add("same");	
	    
	    ar7.removeAll(ar8);
	    
	    for(int i = 0; i<ar7.size(); i++) {
	    	System.out.println(ar7.get(i));
	    }
	    
	    System.out.println("***Retain All***");
	  
	    
	    // retainAll()  = Then wants common factor from both objects 
	    
	    ArrayList ar9 = new ArrayList();
	    ar9.add("Tester");
	    ar9.add("People");
	    ar9.add("shiva");
	    	
	    ArrayList ar10 = new ArrayList();
	    ar10.add("Tester");
	    ar10.add("Public");
	    ar10.add("same");	
	    
	    ar9.retainAll(ar10);
	    
	    for(int i = 0; i<ar9.size(); i++) {
	    	System.out.println(ar9.get(i));
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
