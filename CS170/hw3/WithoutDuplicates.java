

public class WithoutDuplicates{
	
	public static void main(String[] args){ // this is the main method which sets up the arrays which are to be used as inputs in the method withoutDuplicates.
		int[] a = new int []{1, 2, 3};
		System.out.println(withoutDuplicates(a)); 

		
	
	 
		int[] b = new int [] {1,2,1,1,1,3,2,3};
		System.out.println(withoutDuplicates(b));
	 
	}

	public static String withoutDuplicates(int[] x){ // this method is supposed to return a String to the main method and it takes as an input an array of integers 
         
        int number = 0;
        for(int i = 0; i < x.length; i++){ // this is a nested for loop which is set to loop for the length of the array and it adds 1 to the int number every time two elements in the array are equal to each other and the index number is equal as well.
            for(int j = 0; j < x.length; j++){
                if(x[j] == x[i] && i == j && x[i] != 100){
                   number += 1;
                   } else if(x[j] == x[i] && i != j){
                    	x[j] = 100; // element in the array is set to 100 if it is a duplicate 
                        }
                   }

                }
       	int[] withoutduplicate = new int[number]; // sets up a new number which is int number long 
       	int count = 0; 
       	for(int i = 0; i < x.length; i++){
               	if(x[i] != 100){
                    withoutduplicate[count] = x[i]; // the new array is given an element if the int at an index in the array is not equal to 100 
                     	count ++;
                           	} 
                        }
                  
       String result = "{"; // this part is wheere the array of ints is coverted to a String then returned to the main method to be printed. 
       for(int i = 0; i < withoutduplicate.length-1; i++){
           result += withoutduplicate[i] + ",";
           	}
        result += withoutduplicate[withoutduplicate.length-1] + "}";
        return result;
    }

		
}