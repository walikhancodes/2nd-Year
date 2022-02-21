

public class ReverseInPlace{

	public static void main(String[] args){ //this is th main method which sets up an array of integers and sets up the input in the method reverse. 
		int[] a = new int[]{1, 2, 3};
		reverse(a);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");//makes it so that the elements print on the same line in the terminal. 
		}

		 
	}
public static void reverse(int[] x){// this method reversed the order of the elements in the array but it does not return anything to the main method. 
		 
		String result = "";
		for(int i = x.length - 1; i >= 0; i--){
			result += x[i];
		}
		
		for(int i = 0; i < x.length; i++){
			x[i] = Integer.parseInt(result.substring(i, i+1)); // this converts a string in to an int. 
		}
	
	}
}
