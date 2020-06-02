import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class StutterTest {

	@Test
	void testStutter() {
		Stack<Integer> s = new Stack<Integer>();
		assertTrue(s.isEmpty());

		s.push(10);
		s.push(30);
		s.push(20);
		assertTrue(s.peek() == 20);
		assertEquals(3, s.size());
		Stutter.Stutter(s);
		
		System.out.println(s);
		assertEquals(6, s.size());
		assertTrue(s.peek() == 20);
		while(!s.isEmpty()) {
			s.pop();
		}
		assertTrue(s.isEmpty());
	}

}
