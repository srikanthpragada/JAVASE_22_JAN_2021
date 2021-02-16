package oop;

public class BoxingDemo {

	public static void main(String[] args) {
		Object obj;
		
		  obj = 10.50; // AutoBoxing 
		  System.out.println(obj.getClass());
		  
		  double d = (Double) obj; // Downcasting, Unboxing 

	}

}
