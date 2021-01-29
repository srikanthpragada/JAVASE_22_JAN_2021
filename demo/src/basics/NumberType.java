package basics;

import java.util.Scanner;
public class NumberType {
	public static void main(String[] args) {
		int num;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		num = s.nextInt(); // read int from keyboard
		if (num >= 0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}
}
