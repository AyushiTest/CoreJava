package OopsConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {	
	String x = "200";
	System.out.println(x+20);
	
  //	Data Conversion String to Integer	
	int y = Integer.parseInt(x);
	System.out.println(y+10);
	
	// String into Double conversion
	String d = "20.05";
	Double D= Double.parseDouble(d);
	System.out.println(D+5);
		
	// String into boolean conversion
	String b = "True";
	boolean B = Boolean.parseBoolean(b);
	System.out.println(B);
	
	// int to string conversion
	int z = 100;
	System.out.println(z+5);
	
	String s = String.valueOf(z);
	System.out.println(s+20);
	
	
	String u = "100M";
	Integer.parseInt(u);   // It will give me NumberFormatException
	
		
		
	}

}
