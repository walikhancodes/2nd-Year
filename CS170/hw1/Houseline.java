public class Houseline {

  public static void main(String[] args) { //main method makes a new turtle and defines the variables of the method houseline
    Turtle wali = new Turtle();
    houseline(wali, 20);

  }
  public static void houseline(Turtle t, int numHouses) { //the method that makes the turtle move a relative distance then make a house which is 1/n smaller each time.
    for (int i = 0; i < numHouses; i++){
        house(t, i+1);
        t.penup();
        t.forward(80 / (i + 1));
        t.forward(20/(i+1));
        t.pendown();
    }

  }
  public static void house(Turtle t, double s) { // this is the method that makes the house which it does by making the front of the house first then it moves around to make the top.
    front(t, s);
    t.left(90);
    t.forward(80/s);
    t.right(90);
    top(t, s);
    t.left(90);
    t.backward(80/s);
    t.right(90);
  }

  public static void front(Turtle t, double s) { // this is the method which makes the front of the house it does this by making the walls, door, and window.
    walls(t, s);
    t.forward(30/s);
    door(t, s);
    t.penup();
    t.left(90);
    t.forward(50/s);
    t.right(90);
    t.backward(20/s);
    t.pendown();
    windows(t, s);
    t.penup();
    t.backward(10/s);
    t.left(90);
    t.backward(50/s);
    t.right(90);
    t.pendown();
  }

  public static void top(Turtle t, double s) { //this is the method for the top of the house which includes the method for 
    roof(t, s);
    t.penup();
    t.forward(10/s);
    t.left(90);
    t.forward(10/s);
    t.right(90);
    t.pendown();
    chimney(t, s);
    t.penup();
    t.backward(10/s);
    t.right(90);
    t.forward(10/s);
    t.left(90);
    t.pendown();
  }

  public static void walls(Turtle t, double s) { // this is the method which makes the walls which it does by just making a square.
    square(t, 80/s);
  }

  public static void windows(Turtle t, double s) { // this is the method that creates the windows which is just two squares spaces out.

    square(t, 20/s);
    t.penup();
    t.forward(40/s);
    t.pendown();
    square(t, 20/s);
    t.penup();
    t.backward(40/s);
    t.pendown();
  }

  public static void door(Turtle t, double s) { // this is the method for a door which is just the code for a rectangle.
    for (int i = 0; i < 2; i++) {
      t.forward(20/s);
      t.left(90);
      t.forward(30/s);
      t.left(90);
    }
  }

  public static void roof(Turtle t, double s) { // this is the method for the roof which is done by creating a triangle.
    t.forward(80/s);
    t.left(135);
    t.forward(40 * Math.sqrt(2)/s);
    t.left(90);
    t.forward(40 * Math.sqrt(2)/s);
    t.left(135);
  }

  public static void chimney(Turtle t, double s) { // this is the method for the chimney which is done by just moving the turtle around.
    t.left(90);
    t.forward(20/s);
    t.right(90);
    t.forward(10/s);
    t.right(90);
    t.forward(10/s);
    t.backward(10/s);
    t.left(90);
    t.backward(10/s);
    t.left(90);
    t.backward(20/s);
    t.right(90);
  }

  public static void square(Turtle t, double x) { //this is the code for the square which is done with a simple loop of the turtle doing a certain length x and turning a right angle 4 times. 
    for (int i = 0; i < 4; i++) {
      t.forward(x);
      t.left(90);
    }
  }

}
