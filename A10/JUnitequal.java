import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class JUnitequal {
	@Test
	void testEqualsTrue() {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		assertTrue(s1.isEmpty());
		
		s1.push(7); s1.push(2); s1.push(8);
		s2.push(7); s2.push(2); s2.push(8);
		assertTrue(equals.equals(s1, s2));
		assertFalse(s1.isEmpty());
		
	}
	
	@Test
	void testEqualsFalse() {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		assertTrue(s1.isEmpty());
		
		s1.push(42); s1.push(20); s1.push(30);
		s2.push(10); s2.push(20); s2.push(30);
		assertFalse(equals.equals(s1, s2));
		assertFalse(s1.isEmpty());
		
	}
}