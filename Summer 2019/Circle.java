

public class Circle{
	
	public double radiusOfCircle;


	public Circle(){
		radius = 1;
	}

	public Circle(double radius){
		this.radiusOfCircle = radius; 
	}
	

	public void setRadius(double newRadius){
		this.radiusOfCircle = newRadius; 
	}

	public double getRadius(){
		return this.radiusOfCircle;
	}
}