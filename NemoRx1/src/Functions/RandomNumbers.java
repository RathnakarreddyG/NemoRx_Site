package Functions;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		
		Random rand = new Random();

		// Obtain a number between [0 - 49].
		int n = rand.nextInt(15);

		// Add 1 to the result to get a number from the required range
		// (i.e., [1 - 50]).
		n += 2;
		int m = rand.nextInt(15);

		// Add 1 to the result to get a number from the required range
		// (i.e., [1 - 50]).
		m += 2;
		System.out.print(n+"/"+m);
		//System.out.print(m);
	}

}
