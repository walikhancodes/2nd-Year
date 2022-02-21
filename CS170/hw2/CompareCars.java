public class CompareCars { 

	//Task 2: Car A would be cheaper if it was kept for only 5 years whereas, car B is less expensive than Car A after ten years

	// Task 3: returning something in a method returns the type of variable declared after "public static" to the main method whereas printing something using println just prints it on to the terminal. 
	public static void main(String[] args) { // this is the main method 
		System.out.println(compareCars(5)); // this will print the String result of method compareCars at int = 5 years
		System.out.println(compareCars(10)); // this will print the result String of the method compareCars at 10 years
	}

	public static String compareCars(int years) { // this is the method which compares the cost of the two cars over time and the only parameter is the amount of years 
		System.out.println("Year\t\tCar A\t\tCar B"); // the "\t\t" helps print stuff on same line in terminal
		double amountA = 20000;
		double amountB = 30000;
		double gasA = (15000 / 25) * 2.5;
		double gasB = (15000 / 32) * 2.5;
		double maintA = 1300;
		double maintB = 1000;
		double totalA = 0.0;
		double totalB = 0.0;
		for (int i = 0; i < years; i++) {
			double tA = 0.0;
			double tB = 0.0;
			if (i == 0) {
				tA = amountA + gasA;
				tB = amountB + gasB;
			}
			else {
				if (i == 1) {
					tA = maintA + gasA;
					tB = maintB + gasB;
				}
				else {
					maintA += (maintA * 0.15);
					maintB += (maintB * 0.10);
					tA = maintA + gasA;
					tB = maintB + gasB;


				}
			}
			System.out.println(i + "\t\t" + tA + "\t\t" + tB); // this prints the table 
			totalA += tA;
			totalB += tB;
		}
		if (totalA <= totalB) { // this returns the name of the car which is more cheaper 
			return "Car A";
		}
		else {
			return "Car B";
		}
	}
}

