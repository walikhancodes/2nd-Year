

public class Polyspiral{

	public static void polyspiral(Turtle t, int n, double base , int rounds) {
		for (int i = 0; i < rounds; i++) {
			t.forward((i + 1) * base);
			t.right(360.0 / n);
			line(t, n, rounds);
		}
	}
	
	public static void main(String[] args) {
		Turtle t = new Turtle();
		polyspiral(t, 3, 20, 5);
	}
	
}
