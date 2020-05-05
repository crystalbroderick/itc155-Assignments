import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


class jtestIsUnique {
	
	@Test
	void testIsUnique() {
		Map<String, String> m = new HashMap<String, String>();
		m.put("M", "S");
		m.put("S", "R");
		m.put("J", "M");
		assertTrue(isUnique.isUnique(m));
		assertEquals(3, m.size());
		Map<String, String> m2 = new LinkedHashMap<String, String>();
		m2.put("Kendrick", "Perkins");
		m2.put("Stuart", "Reges");
		m2.put("Jessica", "Miller");
		m2.put("Bruce", "Reges");
		assertFalse(isUnique.isUnique(m2));
		m2.remove("Stuart", "Reges");
		m2.remove("Bruce", "Reges");
		assertTrue(isUnique.isUnique(m2));
		assertTrue(m2.containsKey("Kendrick"));
		assertFalse(m2.containsKey("Stuart"));
		assertEquals(2, m2.size());
	}
	

	@Test
	void containsKeyTest() {
		Map<String, String> m = new HashMap<String, String>();
		m.put("M", "S");
		m.put("S", "R");
		m.put("J", "M");		
		assertTrue(m.containsKey("S"));
		assertTrue(m.containsKey("M"));
		assertFalse(m.containsKey("A"));
	}
	
	@Test
	public void testIsEmpty1() {
		Map<String, String> m = new HashMap<String, String>();
		assertTrue(m.isEmpty());
		m.put("Aaa", "Bbb");
		assertFalse("should have one element", m.isEmpty());
		m.put("ccc", "ddd");
		assertFalse("should have two elements", m.isEmpty());
	}



}
