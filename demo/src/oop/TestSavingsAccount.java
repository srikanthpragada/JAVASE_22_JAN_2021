package oop;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount sa; // object reference 
		
		  sa = new SavingsAccount(1,"Steve"); // create object or instance
		  sa.deposit(5000);
		  sa.deposit(10000);
		  sa.withdraw(12000);
		  System.out.println(sa.getBalance());
		  
		 
	}

}
