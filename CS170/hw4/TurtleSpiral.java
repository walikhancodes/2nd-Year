

public class TurtleSpiral{
	
	public static void main(String[] args){ // this is the main method which defines the new Turtle "t". 
		Turtle t = new Turtle();
		t.delay(3);

		turtleSpiral(t,200,2); // draws the turtle spiral using fractals 
		t.penup(); // moves the turtle around and 
		t.forward(210);
		t.pendown();
		turtleSpiralIter(t,200,2); // draws the turtle spiral using iteration 


	}

	public static void turtleSpiral(Turtle t, double size, double minsize){ // this is the method using recursion. This method takes Turtle, a double, and another double as its parameters and returns an action that the turtle does. 
		if(size <= minsize){ // if the size is less than or equal to the minimum size the turtle goes forward the distance of the minimum size side.
			t.forward(minsize);
			t.penup();
		}else{
			t.forward(size);
			t.right(90);
			turtleSpiral(t, size * 0.9, minsize); // calls the method again except with the size of each size 10% shorter.
		}	

	}

	public static void turtleSpiralIter(Turtle t, double size, double minsize){ // method with same parameters as method above it
		while(size >= minsize){ // while the size is greater than or equal to the miniumum size the turtle goes forward variable size each time and right 90 with siee getting smalled by 10% each time.
			 t.forward(size);
			 t.right(90);
			 size *= 0.9;
		}

	}
}