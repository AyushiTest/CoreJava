package OopsConcept;

public class CallbyValAndCallbyRef {

	int p;
    int q;
	
	public static void main(String[] args) {
	
		CallbyValAndCallbyRef obj = new CallbyValAndCallbyRef();
		int m = 20;
		int n = 30;
		obj.sum(m,n);   //call by value or pass by value
		
		obj.p=40;
		obj.q=50;
		
		obj.swap(obj);
		
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
		public int sum(int a , int b) {
		 a = 10;
		 b = 15;
	        int x= a+b;
	   
	        return x;
	    
		}
		
		public void swap(CallbyValAndCallbyRef i) {
		int temp ;
		temp = i.p;   //   temp= 40
		i.p = i.q;    //   t.p = 50
		i.q = temp;   //   t.q = 40
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


