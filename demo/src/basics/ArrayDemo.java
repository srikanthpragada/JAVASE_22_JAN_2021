package basics;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[10];

//		for (int i = 0; i < a.length; i++)
//			System.out.printf("%5d", a[i]);
		
		for (int n : a)
			System.out.printf("%5d",n);

	}

}
