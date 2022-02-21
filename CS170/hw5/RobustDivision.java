public class RobustDivision{

        public static void main(String[] args){ // this is the main method which sets up the array int used as a input for the method sumOFIntegerDiv and prints the result of the method in the terminal
                int[] a = {2, 4, 6, 0, 8, 16};
                System.out.println(sumOfIntegerDiv(a, 4));
                System.out.println(sumOfIntegerDiv(a, 5));
        }

        public static int sumOfIntegerDiv(int[] a, int n){ // has two parameters one is an input of an array of integers and the other is the input of a single integer. 
                int result = 0; // a result value is initialized
                int value = 0;
                for(int i = 1; i < n; i++){
                        try{ //try catch block 
                                if (a[i-1] == 0) throw new ArithmeticException(); // goes to catch 
                                if (i > a.length) throw new ArrayIndexOutOfBoundsException(); // goes to catch 
                                value = (a[i])/(a[i-1]);        
                        }
                        catch(ArithmeticException e){
                                System.out.println("Cannot divide by zero. Skipping index: " + i); //prints this message in the termial while changing the value of n so the class doesnt stop
                                n++;
                               
                        }       
                        catch(ArrayIndexOutOfBoundsException f){
                                System.out.println("Cannot access array at index: " + i); //prints this message in the termial while changing the value of n so the class doesnt stop only if this exception conditions are met
                                n++;
                              
                        }
                        result += value;
                }
                return result;
        }

}
