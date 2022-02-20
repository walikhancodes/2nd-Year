

public class Multistar{
	public static void star(Turtle t, int n, double length) { // in this method i am making the star which is attached to a line 
		
		t.forward(length);	// making the turtle make the line the star is one
		t.forward(length / 4); 
		t.backward(length / 4);
		for (int i = 0; i < n - 1; i++) { //loop for the actual star at the end of the line. 
			t.left(360.0 / n);
			t.forward(length / 4);
			t.backward(length / 4);		
		}
		t.penup();
		t.left(180 + (360.0 / n)); // positioning the turtle so it can make the next star
		t.forward(length);
		t.pendown();
	}

	public static void multistar(Turtle t, int n, double length) { //this method creates the entire shape which just rotates "star" around n times
		
		for (int i = 0; i < n; i++) {
			t.left(180 +(360.0 / n));
			star(t, n, length);
			
		
		}
	} 
	public static void main(String[] args) { //this is the main method which creates the turtle moves it then makes the three Multistar figures. 
		Turtle t = new Turtle();
		t.delay(1);
		multistar(t, 7, 100);

		t.penup();
		t.forward(250);
		t.pendown();
		multistar(t, 10, 70);

		t.penup();
		t.forward(300);
		t.pendown();
		multistar(t, 25, 120);

	}
}