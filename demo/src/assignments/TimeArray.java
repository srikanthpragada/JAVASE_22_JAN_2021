package assignments;

class Time {
	int h, m, s;

	public Time(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}

	public void print() {
		System.out.printf("%02d:%02d:%02d\n", this.h, this.m, this.s);
	}
}

public class TimeArray {

	public static void main(String[] args) {
		Time[] times;

		times = new Time[10];
		for (int i = 0; i < times.length; i++) {
			times[i] = new Time(i + 1, 0, 0);
			times[i].print();
		}
	}

}
