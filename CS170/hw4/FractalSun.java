

public class FractalSun{
	public static void main(String[] args){ // this is the main method

		Turtle t = new Turtle(); // this sets up a new turtle 
		t.delay(1);
		t.penup();
		t.color(0,0,0); // fills in the background as black 
		t.fill();
		t.pendown();
		fractalSun(t,150,5); //sets the values of the parameters of the method fractalSun.
		
	}

	public static void fractalSun(Turtle t, double r, int levels){ // this is the method Fractal sun which takes Turtle, double, and int as its parameters. 
		if(levels > 0){ //this will make the method return something until level is equal to 0 then method returns nothing. 
           	t.penup();
           	t.color(250, 50 * levels, 0); // selects the color of the run 
           	t.forward(r);
           	t.pendown();
           	t.left(90);
           	for(int i = 0; i < 50; i++){ // this creates the sun 
               	t.forward(r * Math.PI / 25);
              	t.left(360.0/50);       
                }
           	t.right(90);
           	t.penup();
           	t.backward(r);
           	t.right(90);
           	t.forward(r / 2);
           	t.fill();
          	t.backward(r);
           	t.fill();
           	t.forward(r / 2);
            t.left(90);
           	t.pendown();     
           	for(int i = 0; i < 8; i++){ //in a loop to make the 8 rays appear around the run and the other smaller suns
               	t.penup(); 
              	t.forward(r);
               	t.pendown();
              	t.forward(3 * (r / 4));
              	t.penup();
               	t.forward(r / 4);
               	t.pendown();
             	fractalSun(t, r / 4, levels - 1); // the recursive call calls for the method again only with radius being a quarter as small
               	t.penup();
              	t.backward(2 * r);
             	t.left(45);
             	t.pendown();
              	t.color(250, 50 * levels, 0); // changes the colors according to levels. 
           	}

       	}
   	}
}
