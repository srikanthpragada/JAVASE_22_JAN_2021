package oop;

public class SavingsAccount {
   // Instance variables 	
   private int acno;
   private String ahname;
   private double balance;
   
   // Constructor 
   public SavingsAccount(int no, String name) {
	   acno = no;
	   ahname = name;
	   balance = 0;
   }
   
   // Methods 
   public void print() {
	   System.out.println(acno);
	   System.out.println(ahname);
	   System.out.println(balance);
   }
   
   public void deposit(double amount) {
	   balance += amount;
   }
   
   public void withdraw(double amount) {
	   if (balance >= amount)
	       balance -= amount;
	   else
		   System.out.println("Insufficient Balance");
   }

   public double getBalance() {
	   return balance;
   }
}
