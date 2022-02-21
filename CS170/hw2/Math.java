

public class Math{

	public static void main(String[] args) { // this is the main method that calls to print the test cases. 
		
		System.out.println(sumOfSquares(4));
		
		System.out.println(product(4,2));
		System.out.println(product(8,5));

		System.out.println(compoundInterest(1000, 0.05, 3));

		System.out.println(polySpiralLength(8,5,3));

	}
 
	public static int sumOfSquares(int n){ // the method sum of squares takes some int result and each interval of n the next  number is 1/n^2.
		int result = 0;
		for (int i = 0; i <= n; i++){
			result += Math.pow(i, 2);
		}
		return result;
	}

	public static int product(int x, int y){ // the method product which returns the product of two numbers without using the multiplication command
		int result = 0;
		for(int i = 0; i < y; i++){
			result += x;
		}
		return result;
	}

	public static double compoundInterest(double money, double interestRate, int years){ // this is a method that will return the amount of total money a person has with an interest rate being added to it yearly 
		double result = money; 
		for (int i = 0; i < years; i++){
			result = result * (1 + interestRate);
		}
		return result; 
	}

	public static double polySpiralLength(int n, double base, int rounds){  // this is the method which will return the length of a polyspiral.
		double result = 0;
		for(int i = 0; i < n * rounds; i++){
		result = base * (i+1);
		
		}
		return result; 

	}

}