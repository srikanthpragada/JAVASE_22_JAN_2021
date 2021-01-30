package basics;

public class VaryingParamsDemo {

	public static void main(String[] args) {
         wish("Scott");
         wish("Scott","Steve","Tom");
         wish("Mike","Jack");
	}
	
	public static void wish(String ... names) {
		for(String name : names)
		 System.out.println("Hello " + name);
	}

}
