public class DigitCount {
	
	public static void main(String[] args) { // this is the main method which tests the print case for our method digitCount.
	System.out.println(digitCount(100, 0));
	System.out.println(digitCount(456234, 8));
	System.out.println(digitCount(456234, 5));
	System.out.println(digitCount(-456234, 4));
	System.out.println(digitCount(0, 0));

	}
	
	public static int digitCount(int number, int digit) { // this is the method digitCount there are two parameters both of them are ints. 
	int count = 0;
	int a;
	if (number == 0) { // if both ints are equal to 0 the method will return 1. 
		if (digit == 0) {
			count++;
		}

	}
	while (number > 0 || number < 0) { // while the number is not at 0 tho the number is losing one digit each time as ints are always rounded 
	a = number % 10;
	number = number / 10;
	if (Math.abs(a) == digit) // is it equal to the absolute value because negative values give different results. 
	count++; // the count is changed to one because a digit in the number is equal to the int digit. 
	}
	return count;
	}

	
}


