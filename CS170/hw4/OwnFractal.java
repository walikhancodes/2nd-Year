

public class OwnFractal{
	
	public static void main(String[] args){ // this is the main method which sets up a new Turtle t. 

		Turtle t = new Turtle();
		t.delay(3);
		t.left(90);
		ownFractal(t,50,5); // gives specific values to the method ownFractal.
		t.right(90);
		t.penup();
		t.forward(300);
		t.left(90);
		ownFractal(t,50,4);

	}

	public static void ownFractal(Turtle t, double size, int level){ // this is my own fractal which is supposed to be similar to a tree with random sized branches 

		if (level > 0) { // method keeps calling itself until level reaches 0. 

			double x = Math.random() * 2.5; 
			t.penup();
			t.color(250 - (50 * level), 50 * level, 0); // the color is also varied starts at red at the higher levels and goes to green.
			t.pendown();
            t.forward(size*x); // brances given a random size. 
            ownFractal(t, size * 0.8, level-1);
            t.right(15 * level);
            t.penup();
			t.color(250 - (50 * level), 50 * level, 0);
			t.pendown();
            ownFractal(t, size * 0.8, level-1); // calls for the branches on the left side. 
            t.left(30 * level);
            t.penup();
			t.color(250 - (50 * level), 50 * level, 0);
		 
			t.pendown();
            ownFractal(t, size * 0.8, level-1); // calls for the branches on the left side 
            t.right(15 * level);
            t.backward(size*x);
			t.color(250 - (50 * level), 50 * level, 0);

        }
	}
}