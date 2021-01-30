
public class Factors {

	public static void main(String[] args) {
		// check whether a number is provided on command line
		if (args.length == 0)
		{
			System.out.println("Usage : java Factors <number>");
			return;  // stop main() 
		}
		
		// Convert first command line argument to int
		int num = Integer.parseInt(args[0]);
		
		for(int i = 2; i <= num/2; i ++)
			if(num % i == 0)
				 System.out.println(i);

	}

}
