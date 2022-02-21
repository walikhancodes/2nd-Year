

public class FractalMickeyMouse{
	
	public static void main(String[] args){
		Turtle t = new Turtle();
		t.delay(3);
		fractalMickeyMouse(t,200,3);

	}

	public static void mickeyFace(Turtle t, double r){
		t.penup();
		t.right(90);
		t.forward(r);
		t.left(90);
		t.pendown();
		
		for(int i = 0; i < 50; i++){
			t.forward(r* Math.PI / 25);
			t.left(360.0/50);       
		}
		
		t.penup();
		t.left(90);
		t.forward(r);
		t.right(90);
		t.forward(r/3);
		t.left(90);
		t.forward(r/3);
		t.pendown();
		
		for(int i = 0; i < 50; i++){
       			t.forward(r/10* Math.PI / 25);
           		t.right(360.0/50);       
		}
		
		t.penup();
		t.right(90);
		t.forward(1);
		t.color(0,0,0);
		t.fill();
		t.backward(1);
		t.left(180);
		t.penup();
		t.forward(r/2);
		t.right(90);
		t.pendown();
		
		for(int i = 0; i < 50; i++){
			t.forward(r/10* Math.PI / 25);
			t.left(360.0/50);       
		}
		
		t.penup();
		t.left(90);
		t.forward(1);
		t.color(0,0,0);
		t.fill();
		t.backward(1);
		t.left(90);
		t.forward(r/3);
		t.left(90);
		t.forward(r/3);
		t.left(90);
		t.pendown();
		
		for(int i = 0; i < 50; i++){

			t.forward(r/15* Math.PI / 25);
			t.left(360.0/50);       
		}
		
		t.penup();
		t.left(90);
		t.forward(1);
		t.color(0,0,0);
		t.fill();
		t.backward(1);
		t.right(180);
		t.forward(r/1.5);
		t.right(90);
		t.pendown();
		
		for(int i = 0; i < 50; i++){

			t.forward(r/1.25* Math.PI / 50);
			t.right(180.0/50);       
		}
		
		t.right(90);
		t.penup();
		t.forward(r/1.2);
	}


	public static void fractalMickeyMouse(Turtle t, double r, int levels){

		if (levels == 0){
			mickeyFace(t,r);
		} else {
			mickeyFace(t,r);
			t.penup();
			t.left(45);
			t.forward(1.5*r);
			t.right(45);
			fractalMickeyMouse(t,r/2,levels-1);
			t.left(45);
			t.backward(1.5*r);
			t.left(90);
			t.forward(1.5*r);
			t.right(135);
			fractalMickeyMouse(t,r/2,levels-1);

			

		}
	}

}
