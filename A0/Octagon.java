import java.text.DecimalFormat;

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

	// calculate perimeter
	public int OctagonPerimeter(int s) {
		return (int) 8 * (s);
	}
	// calculate octagon area
	public int OctagonArea(int s) {
		return (int) (2 * (1 + Math.sqrt(2)) * Math.pow(s, 2));
	}
}