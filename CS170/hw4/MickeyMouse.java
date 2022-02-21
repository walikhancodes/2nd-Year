public class MickeyMouse{
	
	public static void main(String[] args){// this is the main method which sets up a new turtle and puts in the values of the parameters for the method fractalMickeyFace.
		Turtle t = new Turtle();

		t.left(90);
		fractalMickeyMouse(t,200,5);

	}
	
	public static void mickeyFace(Turtle t, double r){ // this is the method for just one face. It uses Turtle and a double as it's parameters. 
		t.left(90);
		t.right(90);
		t.penup();
		t.forward(r);
		t.pendown();
		t.left(90);
		for(int i = 0; i < 360.0; i++){ //this is used to make the outline of the face
			t.left(1);
			t.forward((2*(Math.PI)*r)/360.0);
		}
		t.left(90);
		t.penup();
		t.forward(r);
		t.right(90);
		t.forward(r/2);
		t.left(90);
		t.forward(r/3);
		t.right(90);
		t.pendown();
		for(int i = 0; i < 360; i++){ // this is used to make the eye
			t.left(1);
			t.forward(((Math.PI) * 2 * r / 3600.0));
		}
		t.right(90);
		t.penup();
		t.backward(r/20);
		t.color(0,0,0);
		t.fill();
		t.forward(r/20);
		t.forward(2 * r / 3);
		t.right(90);
		t.pendown();
		for(int i = 0; i < 360; i++){ // this is used to make the other eye
		    t.left(1);
		    t.forward(((Math.PI) * 2 * r / 3600.0));
		}
		t.penup();
		t.right(90);
		t.backward(r/20);
		t.fill();
		t.forward(r/20);
		t.forward(r/3);
		t.left(90);
		t.forward(r/2);
		t.right(180);
		t.pendown();
		for(int i = 0; i < 360; i++){
		    t.left(1);
		    t.forward(((Math.PI) * 2 * r / 7200.0));// this is used to make the nose. 
		}
		t.penup();
		t.right(90);
		t.backward(r/20);
		t.fill();
		t.forward(r/20);
		t.backward(r);
		t.forward(r);
	}
	



	public static void fractalMickeyMouse(Turtle t, double r, int level){ // this is the method which is a fractal of the mickeyFace. It has 3 parameters Turtle, a double, and an int.
		if(level == 0){ // if the level is 0 the method returns nothing
			return;
		}
		else{

		    mickeyFace(t,r); // the method calls the previous method from above
		    t.penup();
		    t.left(45);
		    t.forward(1.5*r);
		    t.pendown();
		    t.right(45);
		    fractalMickeyMouse(t,r/2,level-1); // the method is called with radius being half and level being less by 1.
		    t.left(45);
		    t.penup();
		    t.backward(1.5*r);
		    t.right(90);
		    t.forward(1.5*r);
		    t.left(45);
		    t.pendown();
		    fractalMickeyMouse(t,r/2,level-1); // the method is called again to draw the recursion on the other side. 
		    t.penup();
		    t.right(45);
		    t.backward(1.5*r);
		    t.left(45);
		    t.pendown();
		}   
	}

}

