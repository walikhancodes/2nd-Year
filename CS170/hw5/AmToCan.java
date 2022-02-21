

public class AmToCan{
	
	public static void main(String[] args){// this is the main method which sets up the inputs for the method convertText and prompts something to be printed in the terminal 

		System.out.println(convertText("I do not have a favorite COLOUR nor a favorite ice-cream flavour", "US", "color\tcolour\nflavor\tflavour\n"));
		System.out.println(convertText("I do not have a favorite colour nor a favorite ice-cream flavour", "CA", "color\tcolour\nflavor\tflavour\nfavorite\tfavourite\n")); 	
	}

	public static String convertText(String text, String code, String dictionary){ // this method takes 3 Strings as its input and returns a String to the main method 
		String newText = text.toLowerCase(); 
	
		String [] tempDictionary = dictionary.split("\n"); // the String dictioary is split everytime theres a "\n" and a new array of Strings is created from the divided String

		String [] sentence = newText.split("\\s"); // the String is divided in to an array of Strings with the length being as long as the number of spaces in the sentence 

		if(code.matches("US")){ 
			for(int i = 0; i < tempDictionary.length; i++){
				String[] tempDictionary2 = tempDictionary[i].split("\t"); // splits each String in the array of strings by the "\t"
				for(int j = 0; j < sentence.length; j++){
					if(sentence[j].equals(tempDictionary2[1])){ // if the word is in Canadian style 
						sentence[j] = sentence[j].replaceAll(tempDictionary2[1], tempDictionary2[0]);// replaces the second part of the words in the dictionary (the Canadian one) with the AMmerican spelling the index 0 of the dictionary array 
					}
				}
			}
		}
		if(code.matches("CA")){
			for(int l = 0; l < tempDictionary.length; l++){
				String[] tempDictionary2 = tempDictionary[l].split("\t");
				for(int m = 0; m < sentence.length; m++){
					if(sentence[m].equals(tempDictionary2[1])){
						sentence[m] = sentence[m].replaceAll(tempDictionary2[0], tempDictionary2[1]); // only part that is different for the second part of changing American spelling to canadian spelling just switches the indexes in the array of the words in the dictionary to be replaced.
					}
				}
			}
		}
		String result = ""; // makes the String whole again instead of array of Strings 
		for(int k = 0; k < sentence.length; k++){
			result += sentence[k] + " ";
		}
		return result;

	}
}