

public class ValidFileName{
	
	public static void main(String[] args){ // this is the main method which sets up the inputs for the method isValidFIlename and sets something to print in the terminal
		System.out.println(isValidFilename("homework5.java", "Linux"));
		System.out.println(isValidFilename("hamlet.shakespeare", "Mac"));
		System.out.println(isValidFilename("rom_com3.txt", "Windows"));

	}

	public static boolean isValidFilename(String filename, String sys){ // this is a method which takes 2 Strings as its inputs and returns a true or false value. 
		if (sys.matches("Linux") || sys.matches("Mac")){ // is the sys String is such 
			return filename.matches("[^.:]\\w+\\.[a-zA-Z]{2,6}"); // returns T/F depending if the file name follows a certain pattern 
		} else if (sys.matches("Windows")){ // if the sys String is windows
			return filename.matches("[^\\W][A-Za-z]+\\.[a-zA-Z]{2,6}[^com1-9]$");// returns T/F depending if the file name follows a certain pattern 
		} else{
			return false;
		}
	}


}