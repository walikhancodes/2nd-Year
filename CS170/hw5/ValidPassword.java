

public class ValidPassword{
	
	public static void main(String[] args){ //this is the main method which sets the input for the method isValidPassport and prints something on the terminal 
		System.out.println(isValidPassowrd("Tr7s6d_"));
		System.out.println(isValidPassowrd("Tr7s6 d_"));
		System.out.println(isValidPassowrd("@abc2-bc"));
		System.out.println(isValidPassowrd("ALphaa%"));
		System.out.println(isValidPassowrd("ALpha a%"));
	}

	public static boolean isValidPassowrd(String s){ // this is a method which returns either true or false depending if the String input matches a cetain pattern 
		return s.matches("[A-Z!@#]{1}\\w{5,7}[^*.%]$");
	}
}