package assignments;

public class TotalMarks {

	public static void main(String[] args) {
		String st = "78,45,66,72,80";

		String marks[] = st.split(",");
		int total = 0;

		for (String m : marks) {
			total += Integer.parseInt(m);
		}

		System.out.println(total);

	}

}
