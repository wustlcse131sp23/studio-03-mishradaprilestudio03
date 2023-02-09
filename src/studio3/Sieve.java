package studio3;

import java.util.Scanner;

public class Sieve {Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
	}
		
	{	
	int n = 0;	 
		 
	while (n < 2) {
		 
		System.out.println("How many integers would you like to sort?");
		 n = in.nextInt();

		
		if (n < 2)
			System.out.println("Please enter a number greater than 2!");
		
	}

		
	boolean[] primeNumbers = new boolean [n];	
		for (int i = 0; i < primeNumbers.length; i++) {
			primeNumbers[i] = true;
			
		}

		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (primeNumbers [i] == true) {
				
		for (int j = i*i; j < n; j + i) {
			}

			
					
			
			
		}
		
		
		
		{
			
		
		

	}

}
}
}