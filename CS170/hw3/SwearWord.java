

public class SwearWord{

  public static String swearFilter(String s, String[] b){ // this is the method swearFilter which returns a String to be printed in the main method and takes two variables as inputs. 
                                                            // one input for this method is a String s and another input for this method is an array of Strings 
    String result = "";
    for(int i = 0; i < s.length(); i ++){ // this is a nested for loop which goes on for the length of String s. 
      for(int j = 0; j < b.length;  j++){ // this for loop goes on for the length of of the array of Strings. 
        if(s.charAt(i) == b[j].charAt(0) || s.toLowerCase().charAt(i) == b[j].charAt(0)){
            int count = 0;
            int a = i;
          
            for(int l = 0; l < b[j].length(); l++){
              if(s.charAt(a) == b[j].charAt(l) || s.toLowerCase().charAt(a) == b[j].charAt(l)){ // this is the conditional statement which tests if there is swear word elements in the string. 
              count += 1;
              }
              a += 1;
            }
          
          if(count == b[j].length()){
            if(j == 0){
              result = result + s.substring(i, i + 1);
            }
            for(int m = 0; m < b[j].length() - 2; m++){ // replaces the letter with "*"
              result = result + "*";
            }
            result = result + (s.substring(i + b[j].length() - 1, i + b[j].length())); // combines the string with "*" to the other part of the word. 
          } else if (result.length() < s.substring(0, i+1).length()){ 
            result = result + s.substring(i, i + 1);
        }
      }
    }
    return result;
  } 
  public static void main(String[] args){ // this is the main method which defines String a and sets up a new array of Strings which contain the swear words. 
          String a = "A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!";
          String[] swear = new String[]{"duck", "ship", "whole"};
          System.out.println(swearFilter(a, swear)); // sets up the inputs for the method swearFilter. 

  }
  
}
