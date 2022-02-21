

public class ExtractMovie{
	
	public static void main(String[] args){ // this is the main method which sets up the test cases for the method extractTitle. 
		System.out.println(extractTitle("<item><title>Split (2017)</title><meta><imdb>6375308</imdb></meta>")); // the main method sets up the inputs for the method extrcatTitle and prompts something to be printed in the terminal.
		System.out.println(extractTitle("<item><title>wali (2017)</title><meta><imdb>6375308</imdb></meta>"));
		System.out.println(extractTitle("<item><title><inten>Split (2017)</title><meta><imdb>6375308</imdb></meta>"));
		System.out.println(extractTitle("<item><title><inten>9 (2017)</title><meta><imdb>6375308</imdb></meta>"));
	}

	public static String extractTitle(String s){ // this method takes a String as its input and returns a String to the main method to be printed 
		
		String pattern = "(.+>)(\\w+\\s[(]\\d{4}[)])(.+)"; // this is a patten that the input String must follow. There are three groups in this pattern.

		s = s.replaceAll(pattern, "$2"); // the second part of this pattern can be kept while the first and third parts of this pattern are discarded.

		return s;
	}
}