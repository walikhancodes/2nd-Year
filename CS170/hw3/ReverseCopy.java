public class ReverseCopy{
	public static void main(String[] args){ // this is the main method where the test cases are tested and the elements of the array of int is defined. 
		
		int [] a = new int[]{1,2,3};
		reverseCopy(a);
		System.out.println(print(reverseCopy(a)));

		int [] b = new int[]{3,2,1};
		reverseCopy(b);
		System.out.println(print(reverseCopy(b)));

		int [] c = new int[]{3,2,1,643,634,63,643,4634,345223,532,532,342346,64,76,5,543,35,53,46,465,643,642,53452,646,236};
		reverseCopy(c);
		System.out.println(print(reverseCopy(c)));
	}

	public static int [] reverseCopy(int [] x){ // this is the method which returns an array of integers and as a parameter takes an array of integers as its input. 
 
		int result [] = new int [x.length];
		for(int i = 1; i <=x.length; i++){
			result[i - 1] += x[x.length - i];
		}
		return result;
		
	}
	public static String print(int [] x){ // this is the method which returns a String to the main method and takes an array of integers as its input. 
		String print = "{";
		for(int i = 0; i <=x.length -2; i++){
			print += x[i] + ","; // this method is basically used to print the array of ints by turning the elements in the array in to string by adding it to a String. 
		}
		print += x[x.length-1] +"}";
		return print; 
	}
}