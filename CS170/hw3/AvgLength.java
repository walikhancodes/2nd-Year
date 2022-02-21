

public class AvgLength{
	
	public static void main(String [] args){ // this is the main method which tests the test cases for the method. 

		System.out.println(avgLength(new String[]{"Hello", "Q"})); // the method avgLength takes an array of strings as its input
		System.out.println(avgLength(new String[]{}));
		System.out.println(avgLength(new String[]{"Hello", "Goodbye"}));

	}

	public static double avgLength(String [] x){ // this is the method which returns a double which is supposed to be the average length of the two strings 
		double result = 0;
		if(x.length == 0){ // uses a coniditial statement that if the length of the array of strings is zero than the average is also zero. 
			result = 0;
		} else { // if the length of the array of strings is not equal to zero then the result is equal to all of the lengths at all the indexes combined.
			for(int i = 0; i < x.length; i++){
				result += x[i].length();
			}
		result /= x.length; // the result is then divided by the number of indexes. 
		}
		return result; // this will return the double average to the main method to print. 
	}
}