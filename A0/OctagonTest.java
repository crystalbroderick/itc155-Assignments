import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OctagonTest {
	
	
	
	@Test
	void test1() {
		Octagon o = new Octagon(2);
		Octagon o1 = new Octagon(4);
		Octagon o2 = new Octagon(25);
		assertEquals(19.31371, o.getArea());
		assertEquals(77.25483, o1.getArea());
		assertEquals(3017.76695, o2.getArea());
	}
	
	@Test
	void test2() {
		Octagon o = new Octagon(2);
		Octagon o1 = new Octagon(1000);
		assertEquals(16, o.getPerimeter());
		assertEquals(8000, o1.getPerimeter());
	}
	
}
