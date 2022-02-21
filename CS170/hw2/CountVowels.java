public class CountVowels {
	
	public static void main(String[] args) { // this is the main method 
		System.out.println(countVowels("okay")); // prints the int of number of vowels when the string is set to "okay"
		System.out.println(countVowels("aashna"));// prints the int of the number of vowels when the String is set to "aashna"

		System.out.println(countVowels("VIetnam")); // prints the int of vowels in the word "VIetnam"

	}

	public static int countVowels(String s) { // this is the method countVowels which only takes a String as a parament and outputs an int 
		s = s.toUpperCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') { // basically saying to add one to the result int if the chars in the String are equal to a vowel 
				count++;
			} 
		}
		return count; // returns the int of the number of vowels in a word to the main method to print. 
	}

}
