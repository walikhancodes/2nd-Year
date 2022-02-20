

public class Pyramid{
	public static void main(String[] args) { // this is the main method where we are setting up wali the new Turtle. we are also setting up the values of the variables for the pyramid and we move the turtle in between making the three pyramids. 
		Turtle wali = new Turtle();
		pyramid(wali, 200, 5);
		wali.delay(47);
		wali.penup();
		wali.right(90);
		wali.forward(1000 / 9);
		wali.left(90);
		wali.forward(200);
		wali.pendown();
		pyramid(wali, 200, 10);




	}
	public static void square(Turtle t, double x) { // this is the method for a square two variable, one is the turtle the other is some value of x 
		for (int i = 0; i < 4; i++) {
			t.forward(x);
			t.left(90);
		}
	}

	public static void pyramid(Turtle t, double base, int levels) { //this is the method for the pyramid which is one loop within another loop. 
		
	for(int j = 0; j < levels; j++){ 	
		for (int i = 0; i < (2* levels - 1) - (2 * j); i++) { //makes it so theres less squares as the rows increase. 
			square(t,base/(2*levels-1));
			t.penup();
			t.forward(base/(2*levels-1));
			t.pendown();
		}
		t.penup();
		t.backward(base - 2 * j * (base/(2*levels-1))); // the turtle goes back less and less each time so that the pyramid takes its shape
		t.left(90);
		t.forward(base/(2*levels-1));
		t.right(90);
		t.forward(base/(2*levels-1));
		t.pendown();
		}
	} 
}
