import java.util.Stack;

public class Test{
	
	public static void main(String[] args) {

		Stack<Integer> numPositions = new Stack<Integer>();
		int j = 4;
		int n = 4; 
		int i = 3;
		numPositions.push(3);
		numPositions.push(3);
		numPositions.push(3);
		while(j == n){
        if(numPositions.size() == 1){
          j = numPositions.pop() + 1;
          numPositions.push(j);
          j = 0;
        } else {
          j = numPositions.pop() + 1; 
          i--;
        }
        
        if(numPositions.peek() == n && numPositions.size() == 1){
            numPositions.pop();
            i--;
            j = 0;
        } else {}

      }
      for(int k = 0; k < numPositions.size(); k++){
      	System.out.println(numPositions.get(k));
      }

      System.out.println(i);
      System.out.println(j);
      System.out.println(n);
	}
}