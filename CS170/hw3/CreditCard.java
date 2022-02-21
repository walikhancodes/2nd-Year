

public class CreditCard{
	
	public static void main(String[] args){ // this is the main method whichs sets up the elements contained in each array to be used as test cases 
		
	int[] a = new int[]{4,5,6,3,9,2};
	System.out.println(luhnCheckSum(a)); // defines the elments of the array that are used as an input in the method luhnCheckSum
	int[] b = new int[]{4,9,9,1,6,5,7};
	System.out.println(luhnCheckSum(b));

	}

	public static int luhnCheckSum(int[] x){ // this method returns an int to the main method to be printed
											// this method takes an array of integers as its input. 
		int checksum = 0;
		for(int i = 0; i < x.length; i++){
			String result = "";
			if(i%2 == 0){
				int product = (x[i] * 2); 
				if (product >= 10){
					result += product;
					checksum += Integer.parseInt(result.substring(0, 1)); // this is used to seperate the digits 
					checksum += Integer.parseInt(result.substring(1)); 
				}
				else{
					checksum += product;
				}
			}
			else{
				checksum = checksum + x[i];
			}
		}
		return checksum;// returns the variable of int checksum to the main method to be printed. 
	}
}