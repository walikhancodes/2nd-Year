public class WordCount {
	
	public static void main(String[] args) { // This is the main method which prints the int of the test cases for the method wordCount when the String parameter is set to a specific string 
		System.out.println(wordCount("This is a test"));  
		System.out.println(wordCount("This is a test!!!!!"));
		System.out.println(wordCount("Wahoo42!??!?!"));
		System.out.println(wordCount("This is   a !!!!!"));
		System.out.println(wordCount("This   test!!!!!"));
	}

	public static int wordCount(String c) { // this is the method which counts words  and the parameter for this method is String but will return an int value to the main method to print. 
		int count = 0; 
		if (c.length() > 0) {
			count++;
		}
		for (int i = 0; i < c.length(); i++) {
			if ((c.charAt(i) == ' ') && (c.charAt(i + 1) != ' ')) { // if there is a char followed by no char then the for loop will add one to the count 
				count++;
			}
		}
		return count;
	}
	
}
