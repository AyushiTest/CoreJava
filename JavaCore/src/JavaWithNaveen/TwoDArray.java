package JavaWithNaveen;

public class TwoDArray {

	public static void main(String[] args) {
		
		
		String i [][] = new String [3][4];
		
		System.out.println(i.length +"  length of 2d aray of row");
		
		System.out.println(i[0].length +"  length of 2d aray of column");
		
	// 1st Row
		i[0][0]= "A";
		i[0][1]= "B";
		i[0][2]= "C";
		i[0][3]= "D";
		//2nd row
		i[1][0]= "A1";
		i[1][1]= "B1";
		i[1][2]= "C1";
		i[1][3]= "D1";
		// 3rd row
		i[2][0]= "A2";
		i[2][1]= "B2";
		i[2][2]= "C2";
		i[2][3]= "D2";
		 
		System.out.println(i[1][1]+ " According to given Value of 2D array");
		
		//Print full list of array by using For loop
		
		for(int row=0;row<i.length;row++) {
			for(int col=0;col<i[0].length;col++) {
				System.out.println(i[row][col]);
			}
		}
		
		
		
		
		
		
		

	}

}
