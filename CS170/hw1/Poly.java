public class Poly{
	
	public static void main(String[] args){ // this is the main method where a new Turtle bob gets created and is moved arounnd between drawing the three polyspirals. 
		Turtle bob = new Turtle();
		bob.penup();
		bob.backward(345);
		bob.pendown();
		polyspiral(bob, 3, 20, 5);
		bob.penup();
		bob.forward(480);
		bob.right(90);
		bob.forward(150);
		bob.left(90);
		bob.pendown();
		polyspiral(bob, 5, 10, 4);
		bob.penup();
		bob.forward(480);
		bob.right(90);
		bob.forward(150);
		bob.left(90);
		bob.pendown();
		polyspiral(bob, 8, 5, 3);
	}

	public static void polyspiral(Turtle t, int n, double base, int rounds){ // this is the method for the polyspiral and all it is doing is taking a certain variable distance "base" and multiplying it by a factor of i+1 which makes the base bigger each time it rotates 360.0 / n degrees and the loop is repeated n * rounds amount of times. THis is to ensure the Polyspiral is long and the shape that it should be.
		for(int i = 0; i < n * rounds; i++){
			t.forward(base * (i+1));
			t.right(360/n);
		}
	}
	
}
