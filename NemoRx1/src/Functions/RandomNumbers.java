package Functions;

import java.util.Random;

public class RandomNumbers {

	public static  String Number(){
	
		
		Random rand = new Random();
	int n = rand.nextInt(15);
	n += 2;
	int m = rand.nextInt(15);
	m += 2;
	//System.out.print(n+"/"+m);
	String number = n+"/"+m;
	return number;
	
}
	public static void main(String args[]){
		
		System.out.println(RandomNumbers.Number());
		
	}
	
	}
