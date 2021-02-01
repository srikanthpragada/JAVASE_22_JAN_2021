package oop;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount sa; // object reference 
		
		  sa = new SavingsAccount(); // create object 
		  // sa.acno = 10;
		  sa.open(1, "Steve"); // call method
		  sa.print();
	}

}
