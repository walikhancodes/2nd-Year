

public class StudentAvg{
	
	public static void main(String[] args){ // this is the main method which sets up a new array of doubles to be used as an input in the method "studentAverages". 

		System.out.println(studentAverages(new double[][]{{50,100,0},{100,100,80}}));
	}

	public static String studentAverages(double [][] x){ // this is the method studentAverages which returns a String to the main method to be printed and takes in an array of doubles as an input. 
		String avg = "{";
		double [] result = new double [2];
		 
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x[0].length; j++){ // this is a nested for loop which basically produces the elements to be put in to the new array which contains the averages of the students. 
				result[i] += x[i][j]/3; 
			}
		}

		for(int i = 0; i < x.length -1 ; i++){ // this is the for loop which converts the array of doubles which contains the averages in to a String to be printed in the main method. 
			
				avg += result[i] + ",";
			
		}
		avg += result[x.length-1] + "}"; // for the last elment to be printed without repetition of a ",".
		return avg;
	}
}