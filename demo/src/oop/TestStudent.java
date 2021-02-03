package oop;

class Student {
	private int admno;
	private String name;
	private int course, feepaid;

	public Student(int no, String n, int c) {
		admno = no;
		name = n;
		course = c;
	}

	public void print() {
		System.out.println(admno);   // int
		System.out.println(name);   // String
		System.out.println(getCourseName());
	}

	private String getCourseName() {
		return course == 1 ? "Java SE" : "Java EE";
	}

	public int getTotalFee() {
		return course == 1 ? 5000 : 10000;
	}

	public void pay(int amount) {
		if (amount > getDue())
			System.out.println("Excess amount being paid!");
		else
			feepaid += amount;
	}

	public int getDue() {
		return getTotalFee() - feepaid;
	}
}

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student(1,"Tom",2);
		s.pay(5000);
		s.print();
		System.out.println(s.getDue());
	}
}
