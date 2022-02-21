

public class IsReverse{
	
	public static void main(String[] args){ // This is the main method which tests the test cases for the method isReverse. 
		//what is contained in the strings which are used in the method are defined here
		System.out.println(isReverse("happy", "yppah"));
		System.out.println(isReverse("wali", "ilaw"));
		System.out.println(isReverse("cool", "loac"));
		System.out.println(isReverse("", ""));
	}

	public static boolean isReverse(String a, String b){ // this is the method isReverse which returns true if the strings are both 
														//empty but will return the boolean of is the char at the. begining of String 1 equal to the last char of String 2.
		if(b.length() == 0 && a.length() == 0){
			return true;
		} else {
			return (a.charAt(0) == b.charAt(b.length()-1)) && isReverse(a.substring(1), b.substring(0,b.length()-1));
		}
	}
}