package oop;

class Time {
	private int hours, mins, secs;

	public Time(int hours, int mins, int secs) {
		this.hours = hours;
		this.mins = mins;
		this.secs = secs;
	}

	@Override
	public String toString() {
		// return this.hours + ":" + this.mins + ":" + this.secs;
		return String.format("%02d:%02d:%02d", this.hours, this.mins, this.secs);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Time) {
			Time other = (Time) obj;
			return this.hours == other.hours && this.mins == other.mins && this.secs == other.secs;
		}
		return false;
	}
	
	@Override 
	public int hashCode() {
		return this.hours;
	}
}

public class TestTime {

	public static void main(String[] args) {
		Time t1 = new Time(1, 2, 3);
		System.out.println(t1.hashCode());
		Time t2 = new Time(1, 2, 3);
		System.out.println(t2.hashCode());
		
		System.out.println(t1.toString());
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals("Abc"));

	}

}
