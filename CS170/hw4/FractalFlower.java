

public class FractalFlower{

	public static void main(String[] args){ // this is the main method which sets up a new Turtle also sets the values for the parameters for the various methods. Also moves the turtle in between drawing the different methods. 
		Turtle t = new Turtle();
		t.delay(1);
		t.left(90);
		simpleFlower(t, 200);
		t.penup();
		t.forward(200);
		t.left(90);
		t.pendown();
		fractalFlower(t,250,3);
		t.penup();
		t.right(90);
		t.forward(200);
		t.pendown();
		t.left(90);
		fractalFlower(t,300,4);



	}

	public static void simpleFlower(Turtle t, double size){ // this is the method for a simple flower without using recursion. The parameters are Turtle and a double.
 
		t.forward(size); // this is the stem
		t.backward(size/3);
		for(int i = 0; i < 8; i++){ // produces the petal 
			t.left(360.0/8);
			t.forward(size/3);
			t.backward(size/3);
		}
		t.backward(2*size/3);
		t.right(90);
	}

	public static void fractalFlower(Turtle t, double size, int level) {
		if (level == 0) return;// if the level is equal to 0 the method returns nothing
		else { 
			t.forward(2 * size / 3);  // this is the stem
			for (int i = 0; i < 8; i++) {  // each time the turtle makes the petal and stem smaller by 1/3.
				fractalFlower(t, size/3, level -1);  
				t.forward(size / 3);
				t.penup();
				t.backward(size / 3);
				t.left(45);
				t.pendown();
			}
		}
		t.penup();
		t.backward(2 * size / 3);  // brings turtle back to the origin.
	}
}

