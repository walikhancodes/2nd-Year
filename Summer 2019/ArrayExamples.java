

public class ArrayExamples{
	
	public static void main(String[] args){

		Circle[] circleArray = new Circle[5];

		for(int i = 0; i < 5; i++){
			System.out.println(circleArray[i]);
		}
		for(int i = 0; i < 5; i++){
			circleArray[i] = new Circle(i);
		}

		for(int i = 0; i < 5; i++){
			circleArray[i] = new Circle(i);

		}

		for(int i = 0; i < 5; i++){
			System.out.println(circleArray[i]);
		}

		for(int i = 0; i < 5; i++){
			System.out.println(circleArray[i].getRadius());
		}
	}
}