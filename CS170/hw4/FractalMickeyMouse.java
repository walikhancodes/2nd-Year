

public class FractalMickeyMouse{
	
public static void main(String[] args){
	Turtle t = new Turtle();
	t.delay(3);
	fractalMickeyMouse(t,200,3);

}
public static void mickeyFace(Turtle t, double r){
        t.right(90);
        t.penup();
        t.forward(r);
        t.pendown();
        t.left(90);
        //moves turtle from the starting point to edge of a circle with radius r
        double a= ((Math.PI) * 2 * r / 360);
        //movement for the turtle going 1/360th the circufrence of the circle
        for(int i = 1; i <= 360; i++){
            t.left(1);
            t.forward(a);
            //moves the turtle forward a and left 1 degree 360 times to make a full circle
        }
        t.left(90);
        t.penup();
        t.forward(r);
        t.right(90);
        t.forward(r/3);
        t.left(90);
        t.forward(r/5);
        t.right(90);
        t.pendown();
        //moves turtle to the edge of the first eye
        double b= ((Math.PI) * 2 * r / 3600);
        for(int i = 1; i < 361; i++){
            t.left(1);
            t.forward(b);
        }
        //creates a circle for the first eye
        t.penup();
        t.right(90);
        t.backward(r/10);
        t.color("red");
        t.fill();
        t.forward(r/10);
        //gives the eye a color 
        t.forward(2 * r / 5);
        t.right(90);
        t.pendown();
        //moves turtle to edge of second eye
        for(int i = 1; i < 361; i++){
            t.left(1);
            t.forward(b);
        }
        //creates circle for second eye
        t.penup();
        t.right(90);
        t.backward(r/10);
        t.fill();
        t.forward(r/10);
        //gives the eye color
        t.forward(r/5);
        t.left(90);
        t.forward(r/2);
        //moves turtle to the top of the nose
        t.right(30);
        t.pendown();
        t.forward(r/5);
        t.left(120);
        t.forward(r/5);
        t.left(120);
        t.forward(r/5);
        t.right(30);
        //creates nose
        t.penup();
        t.backward(r/10);
        t.fill();
        //colors nose
        t.forward(r/10);
        t.left(90);
        t.forward(0.8 * r);
        t.left(90);
        //moves turtle to one end of the smile
        t.pendown();
        double c= ((Math.PI) * 2 * 0.8 * r / 360);
        for(int i = 1; i < 181; i++){
            t.left(1);
            t.forward(c);
        }
        //creates a half circle with a radius 0.8 the size of the whole face
        //this is the smile
        t.left(90);
        t.penup();
        t.forward(r * 0.8);
        t.right(90);
        t.forward(r/6);
        t.color("yellow");
        t.fill();
        //gives the face color
    }

    public static void fractalMickeyMouse(Turtle t, double r, int level){
        if(level == 0){

        }
        else{

            mickeyFace(t,r);
            t.left(45);
            t.penup();
            t.forward(3*r/2);
            t.right(45);
            t.pendown();
            fractalMickeyMouse(t,r/2,level-1);
            //turns the turtle 45 degrees and to the edge of the face
            //calls the next level of the face drawing a face with half the radius where the ear should be
            t.penup();
            t.left(45);
            t.backward(3*r/2);
            t.right(90);
            t.forward(3*r/2);
            t.left(45);
            t.pendown();
            fractalMickeyMouse(t,r/2,level-1);
            //does the same thing on the other side of the face
            t.penup();
            t.right(45);
            t.backward(3*r/2);
            t.left(45);
            t.pendown();
            //moves turtle back to the original position
        }   
    }
     
}
