

public class LetterCount{
	
	public static void main(String[] args) { // this is the main method 

		System.out.println(letterCount("abc-123-abc-ABC", "b")); // prints an int which is the number of times the letter string on the right appeard within the string on the left. 
		System.out.println(letterCount("This is Interesting!", "z"));
		System.out.println(letterCount("0", "q"));

	}

	public static int letterCount(String s, String s1){ // this is the method which is called letterCount and it takes two strings as its parameters. 
		int result = 0;
		
		for (int i = 0; i < s.length(); i++){ // basically saying that for as long as the String s, if the char at index of String s1 is equal to the char at any index of String s 
			char a = s.charAt(i);             // then 1 gets added to the result int 
			char b = s1.charAt(0);
			if (a == b){
				result += 1;
			}
		
		}
		return result; // the result of int is returned to the main method. 
	}

}