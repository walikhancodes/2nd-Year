

public class SumOfDiffs{
	
	public static void main(String[] args){ // this is the main method which sets up the array of integers that is used as an input for the method sumOfDiffs. 
		// there are four test cases in the main method which use four different arrays with differnt elements, but all are arrays of integers. 
		System.out.println(sumOfDiffs(new int[]{3,4,5})); 
		System.out.println(sumOfDiffs(new int[]{4,1,19, 6}));
		System.out.println(sumOfDiffs(new int[]{}));
		System.out.println(sumOfDiffs(new int[]{3,0,-1}));
	}

	public static int sumOfDiffs(int [] x){ // this method returns an integer to the main method and as a parameter uses an array of integers as its input. 
		int result = 0;
		for(int i = 0; i < x.length -1; i++){
			result += x[i] - x[i+1]; 
		}
		return result; //returns a double to the main method to be printed.
	}
}