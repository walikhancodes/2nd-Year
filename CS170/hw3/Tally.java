

public class Tally{
	
	public static void main(String[] args){ // this is the main method which sets up the test cases for the method "tally". 


		
		System.out.println(tally("HEY! Apples and bananas")); // the method tally takes this string as an input. 
		System.out.println(tally("HEY! Apples and bananasofeuoptewogivaiogvhgoireho"));
		System.out.println(tally("HEY! Apples and bananaswalioouououiuiouououo"));
	}

	public static String tally(String s){ // this is the method tally which returns a String to be printed in the main method and as a parameter takes a String s as an input. 
		String result = "{";
		
		int a = 0; // sets up variables for the count of each vowel. 
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;

		
		String x = s.toLowerCase(); // converts the string in to lower case letters.
		
		for(int j = 0; j < s.length(); j++){ // basically if any vowel is detected the variable int that is responsible for the count of each variable goes up by one. 
			if(x.charAt(j) == 'a'){
				a += 1;
			}else if(x.charAt(j) == 'e'){
				e += 1;
			}else if(x.charAt(j) == 'i'){
				i += 1;
			}else if(x.charAt(j) == 'o'){
				o += 1;
			}else if(x.charAt(j) == 'u'){
				u += 1;
			}
		}	

		int [] tally = new int []{a,e,i,o,u}; //basically sets up an array with the elements which are the variables int which count the vowels. 

		for(int m = 0; m<tally.length-1; m++){ // converts the int of arrays in to a string so that it can be printed in the main method.
			result += tally[m] + ",";
		}
		result += tally[tally.length-1] + "}";
		return result;
	}
}