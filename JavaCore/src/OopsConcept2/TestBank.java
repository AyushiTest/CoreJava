package OopsConcept2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
	HDBank hd = new HDBank();
	hd.credit();
	hd.debit();
	hd.trasfermoney();
	hd.EducationLoan();
	hd.CarLoan();
	
	//dynamic polymorphism :
	// child class object can be referenced by parent interface reference var
	USBank us = new HDBank();
	us.credit();
	us.debit();
	us.trasfermoney();
	
		
		
		
		
		
		
		
		
		

	}

}
