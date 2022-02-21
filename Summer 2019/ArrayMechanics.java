public class ArrayMechanics{
	
	public static void main(String[] args){
		int[] myArray = {1,2,3,4,5};
		int[] newArray = myArray;

		for(int i = 0; i < myArray.length; i++){
			System.out.println(myArray[i]);

		}

		for(int i = 0; i < newArray.length; i++){
			System.out.println(newArray[i]);
		}

		System.out.println();

		newArray[0] = 1000;

		for(int i = 0; i < myArray.length; i++){
			System.out.println(myArray[i]);

		}

		for(int i = 0; i < newArray.length; i++){
			System.out.println(newArray[i]);
		}
	}


	
}