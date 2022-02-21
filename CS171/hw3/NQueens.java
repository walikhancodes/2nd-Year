import java.util.Stack;
//Wali Khan 
//2308097
//wali.m.khan@emory.edu
/*
THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT CONSULTING ANY
SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR . Wali Khan
*/

public class NQueens {

 
  //***** fill in your code here *****
  //feel free to add additional methods as necessary
 
  //finds and prints out all solutions to the n-queens problem
  public static int solve(int n) {

    //***** fill in your code here *****
    
    //update the following statement to return the number of solutions found
    Stack<Integer> numPositions = new Stack<Integer>(); 
    int result = 0; 
    int i = 1; 
    int j = 0;
    numPositions.push(j);

    while (!numPositions.isEmpty()){
      // test to see if we can place queen here
      if(isVertical(numPositions, i, j) || isDiagonal(numPositions, i, j)){
        j++;
      } else {
        numPositions.push(j);
        i++;
        j = 0; 
      }
      while(j >= n){
        if(numPositions.size() <= 1){
          j = numPositions.pop() + 1;
          numPositions.push(j);
          j = 0;
        } else {
          j = numPositions.pop() + 1; 
          i--;
        }
        
        if(numPositions.peek() >= n  && numPositions.size() <= 1){
            numPositions.pop();
            i--;
            j = 0;
        } else {

        }

      }
      
      if(numPositions.size() == n && numPositions.get(numPositions.size() - 1) == j){
        printSolution(numPositions);
        result++;
        j = numPositions.pop() + 1; 
        i--;
   

        
      }

    }
  
    return result;
    
  }//solve()

  //in this method isVertical I am running through each element in the stack using a for loop to check if an old 
  //value of j(the vertical position of a Queen in the previous row, which is the most recent element in the stack) is equal to the 
  // current value of j.
  public static boolean isVertical(Stack<Integer> numPositions, int i, int j){ //method takes in as inputs the stack used in solve, i from solve, and j froms solve
    for(int s = 0; s < numPositions.size(); s++){
      if(numPositions.elementAt(s) == j){
        return true; 
      } else {
      }
    } 
     return false; // method returns a boolean
  }
  //in this method isDiagnol I am running through each element in the stack using a for loop to check if an old 
  //value of j(the vertical position of a Queen in the previous row, which is the most recent element in the stack) and the 
  // current value of j have either a slope of 1 or -1 meaning that the positions of the two are diagnol. 

  public static boolean isDiagonal(Stack<Integer> numPositions, int i, int j){//method takes in as inputs the stack used in solve, i from solve, and j froms solve
    for(int s = 0; s < numPositions.size(); s++){
      if((numPositions.elementAt(s) - j) == (s - i) || (numPositions.elementAt(s) - j) == (i-s)){
        return true;
      } else{}
    }
    return false;// method returns a boolean
  }
  
  
  //this method prints out a solution from the current stack
  //(you should not need to modify this method)
  private static void printSolution(Stack<Integer> s) {
    for (int i = 0; i < s.size(); i ++) {
      for (int j = 0; j < s.size(); j ++) {
        if (j == s.get(i))
          System.out.print("Q ");
        else
          System.out.print("* ");
      }//for
      System.out.println();
    }//for
    System.out.println();  
  }//printSolution()
  
  // ----- the main method -----
  // (you shouldn't need to change this method)
  public static void main(String[] args) {
  
  int n = 4;
  
  // pass in parameter n from command line
  if (args.length == 1) {
    n = Integer.parseInt(args[0].trim());
    if (n < 1) {
      System.out.println("Incorrect parameter");
      System.exit(-1);
    }//if   
  }//if
  
  int number = solve(n);
  System.out.println("There are " + number + " solutions to the " + n + "-queens problem.");
 }//main()
  
}
