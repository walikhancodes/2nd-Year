

public class SwearFilter{

	public static void main(String[] args){ // this is the main method which sets up the array of Strings that are used as an input for the method swearFilter and the regular String which is also an input for the method 
		
		String [] swear = new String [] {"duck", "ship", "whole", "SHIP!!!"};

		System.out.println(swearFilter("A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!", swear)); // prompts something to print in the terminal 
	


	}

	public static String swearFilter(String s, String [] x){ // this method takes an array of Strings and a String as its inputs and returns a String to the main method 
		String result = ""; // initializes the String result
		String pattern = "([A-Za-z]{1})([A-Za-z]{2})([A-Za-z]{1})"; // a general expression for a pattern 

		String [] words = s.split("\\s"); // splits the String s in to an array of words based on the number of spaces. 

		for(int i = 0; i < words.length; i++){ 
			for(int j = 0; j < x.length; j++){

				if(words[i].equals(x[j]) || words[i].toLowerCase().equals(x[j])){ // if the word in the sentence is equal to a word in the swear word array 
					words[i] = words[i].replaceAll(pattern, "$1**$3"); // then it is censored using this pattenr in the replaceAll method 
				}
			}
		}


		for(int i = 0; i < words.length; i++){ // converts from array of String to String 
			result += words[i] + " ";
		}
		return result;
	}
}
