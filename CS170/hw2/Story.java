public class Story{
	
	public static void main(String[] args){
		System.out.println(storyteller("Alissa","Shantanu", "shirts", 56, "mice" , "margarine", "cheeseburger")); // this is the main method which sets up the values which compose the  6 strings and 1 int
	}
	
	public static String storyteller(String n1,String n2, String possession, int i, String b, String c,String d){ // this is the story teller method which has 6 strings and 1 int as its parameter
		String result = "";
		result += n1 + " was a egocentric princess. ";
		result += n2 + " was a fat wizard ";
		result += n1 + " had " +i+ " red shirts, whereas " + n2 + " had only " + i/2 + ". ";
		result += "Because of envy, " + n2 + " cast a spell on " + n1 + ", yelling these arcane magic words: '"; 

		String magic = "" + (n1.substring(n1.length()-1)).toUpperCase() + "aa" +  (n1.substring(0,1)).toLowerCase() + " " ; // the magic sentence with the letters and in both upperCaps and lowerCaps 
		magic += n2.substring(n2.length()-1) + "ee" + (n2.substring(0,1)).toLowerCase() + " ";
		magic += possession.substring(possession.length()-1) + "ii" + possession.substring(0,1) +"! "; // using substrings for the letters of the girls name at the end 
		magic += magic.toUpperCase(); // converts to upercase 

		result += magic + "'. All of a sudden, " + n1 + "`s " + i + " " + possession + " trasnformed in to  " + b + ". " + n1 + 
		" became upset and wanted to eat food, she went to the kitchen in hopes of finding some " + c + " she could not find that so she ended up eating a "
		 + d + ". After eating food, " + n1 + " decided she had a long day and it was now time to retire to bed.";
		return result;
	}

}
