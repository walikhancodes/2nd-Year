

public class Overload {
	
	public static void main(String[] args){
		int x = max(6 , 10);
		System.out.println("The value of x is: " + x);

		double y = 1.0;

		 y = max(6.0, 10.0); 
		 System.out.println("The value of y is: " + y);


	}

	public static int max(int num1, int num2){
		if(num1 > num2){
			return num1;
		} else {
			return num2;
		}
	}

	public static int max(double num1, double num2){
		System.out.println("Hello!");
		return 0; 
	}
}