

public class DecimalToBinary{
	
	public static void main(String[] args) { // this is the main method with 5 test cases. we testes the bounds 0 and 255 as well as a few numbers in between 

		System.out.println(decimalToBinary(0));
		System.out.println(decimalToBinary(255)); // this prints the String when the int parameter in the method is set to a certain int 
		System.out.println(decimalToBinary(100));
		System.out.println(decimalToBinary(50));
		System.out.println(decimalToBinary(10));
	}

	public static String decimalToBinary(int n){ // this is the method which converts a decimal numebr to a binary one
		int r;										// we are declaring the variable r as type int 
		String result = ""; // we are declaring that the String result is empty.
		if (n == 0){ // if n is equal to 0 then the String result is "000000000"
			result = "00000000";
		}
		while (n > 0){ // this while loop is active when n is greater than 0 and all it does it it takes a number and modulus it by 2 then change n by dividing it by 2 
			r = n % 2;
			n = n / 2;
			result = r + result;  // result will be binary
		}
		
		while (result.length() < 8){ // makes the length of the binary number always equal to 8.
			result = "0" + result; 
		}
		return result;
	}
}	