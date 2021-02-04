package oop;

class Student {
	private int admno;
	private String name;
	private int course, feepaid;

	public Student(int admno, String name, int course) {
		this.admno = admno;
		this.name = name;
		this.course = course;
	}

	
	public Student(int admno, String name, int course, int feepaid) {
		 this(admno,name,course); // call a constructor 
		 this.feepaid = feepaid;
	}

	
	public void print() {
		System.out.println(this.admno);   // int
		System.out.println(this.name);   // String
		System.out.println(getCourseName());
	}

	private String getCourseName() {
		return this.course == 1 ? "Java SE" : "Java EE";
	}

	public int getTotalFee() {
		return this.course == 1 ? 5000 : 10000;
	}

	public void pay(int amount) {
		if (amount > getDue())
			System.out.println("Excess amount being paid!");
		else
			this.feepaid += amount;
	}

	public int getDue() {
		return getTotalFee() - this.feepaid;
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
