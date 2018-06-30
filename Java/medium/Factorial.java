package problem4;

import java.math.BigInteger;

public class Factorial {

	
	BigInteger factorial(int n) {
		BigInteger result  = new BigInteger(String.valueOf(n));
		
		if(n==1) { return result; }
		
		return result.multiply(factorial(n-1));
	}
	
	
	public static void main(String[] args) throws Exception {

		Factorial f = new Factorial();

		int n = 13;
		if (n >= 1 && n <= 99)
			System.out.println(f.factorial(n).toString());
		else
			throw new Exception();
		
	}

}
