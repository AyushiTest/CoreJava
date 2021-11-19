package JavaWithNaveen;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
   Hashtable h = new Hashtable();	
		
  h.put("A", "Object");
  h.put("B", "Time");
  
  System.out.println(h.size());
  
  h.put(1, "zero");
  h.put(2, "9");
  h.put(3, "Meera");
  System.out.println(h.size());
  System.out.println(h.get(3));
  System.out.println(h.get("B"));
  
  Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();	
  h1.put(3, 50);
 // h1.put("b", "bobby");
  
  
  
  
	}

}
