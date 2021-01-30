package basics;

public class FunsDemo {

	public static void main(String[] args) {
		 print(10);
		 System.out.println(factorial(6));
	}
	
	public static void print(int num) {
		System.out.println(num);
	}
	
	public static int add(int a,int b) {
		return a + b;
	}
	
	public static int factorial(int num) {
		int fact = 1;
		
		   for(int i = 2; i <= num; i ++)
			   fact *= i;
		   
		   return fact;
	}

}
