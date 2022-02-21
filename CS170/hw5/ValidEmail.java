

public class ValidEmail{
	
	public static void main(String[] args){ // this is the main method which sets up the input for the methof isValidEmail and prints the return value from the method on to the terminal 

		System.out.println(isValidEmail("user_123@gmail.com"));
		System.out.println(isValidEmail("user123alpha@gmail.com"));
	}

	public static boolean isValidEmail(String s){ // this is the method which takes a String as its input and returns a boolean to the main method 
		return s.matches("[A-Za-z]{1}\\w{1,9}\\@[A-Za-z0-9]{1,12}\\.[a-z]{1,3}"); // returns either true or false depending if the input string matches this general expression pattern 
	}
}