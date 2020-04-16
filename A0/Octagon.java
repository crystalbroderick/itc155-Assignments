//represents Octagon shape
public class Octagon implements Shape {

	private double side;

	// constructs octagon
	public Octagon(double side) {
		this.side = side;
	}

	// returns the area of the octagon
	public double getArea() {
		double a = 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
		return Math.round(a * 100000d) / 100000d;
	}

	// returns the perimeter of the octagon
	public double getPerimeter() {
		double p = 8 * side;
		return p;
	}
}