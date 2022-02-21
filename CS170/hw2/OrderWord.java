public class OrderWord {
	
	public static void main(String[] args) { // this is the main method which prints a boolean value of true if the word contains letters that are alphanumeric otherwise will return false. 
		System.out.println(isOrdered("Hello"));
		System.out.println(isOrdered("AAaaayy"));
		System.out.println(isOrdered(""));
		System.out.println(isOrdered("A"));


	}

	public static boolean isOrdered(String n) { // this is the method which returns a boolean value and takes a parameter of some type of String. 
		n = n.toLowerCase();
	if (n.length() == 0) { // if the String is empty then the result is true 
	return true;
	}
	if (n.length() == 1) { // if the String is just one char then the result is true 
	return true;
	}
	for (int i = 0; i < n.length() - 1; i++) {
	if (n.charAt(i) > n.charAt(i + 1)) {// if the index of char at i of the String is greater than the next char then rthe method will return false 
	return false;

	}
	}
	return true;
	}
}


// small letter A is 97
// small z is 122
// cap A is 65
// cap Z is 90