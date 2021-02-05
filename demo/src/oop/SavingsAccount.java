package oop;

public class SavingsAccount {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;
	private static int minbalance = 5000;

	public SavingsAccount(int acno, String ahname, double balance) {
		super();
		this.acno = acno;
		this.ahname = ahname;
		this.balance = balance;
	}

	public static void setMinBalance(int minbal) {
		SavingsAccount.minbalance = minbal;
	}
	
	// Methods 
	public void print() {
		System.out.println(this.acno);
		System.out.println(this.ahname);
		System.out.println(this.balance);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance - SavingsAccount.minbalance >= amount)
			this.balance -= amount;
		else
			System.out.println("Insufficient Balance");
	}

	public double getBalance() {
		return this.balance;
	}
}
