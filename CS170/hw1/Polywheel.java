

public class Polywheel {
	
	public static void polygon(Turtle t, int numSides, double length) { // in this method i am drawing a polygon that has all sides equal to length and all angles equal to 360.0/number of sides.
	 for (int i = 0; i < numSides; i++) {
	 	
	 	t.forward(length);
	 	t.left(360.0 / numSides);

	 	}
	 }
	 public static void polywheel(Turtle t, int numSides, double length) { // in this method I am drawing the polygon and making it rotate by the angle 360 / number of sides on the polygon and drawing the polygon the amount of times as their are sides on the polygon
	 	for (int i = 0; i < numSides; i++) {
	 		
	 		polygon(t, numSides, length);
	 		t.forward(length);
	 		t.right(360.0 / numSides); 
	 	}
	 }

	 public static void main(String[] args) {
	 	Turtle t = new Turtle();
	 	polywheel(t, 3, 70);

	 	t.penup();
	 	t.forward(200);
	 	t.pendown();
	 	polywheel(t, 4, 50);

	 	t.penup();
	 	t.forward(200);
	 	t.pendown();
	 	polywheel(t, 5, 40);

	 	t.penup();
	 	t.forward(200);
	 	t.pendown();
	 	polywheel(t, 6, 30);

	 	t.penup();
	 	t.forward(200);
	 	t.pendown();
	 	polywheel(t, 12, 15);


	 	
	 }
}