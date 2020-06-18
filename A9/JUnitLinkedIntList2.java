import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitLinkedIntList2 {

	@Test
	void testAdd() {
        LinkedIntList2 list = new LinkedIntList2();
        assertEquals(0, list.size());
        list.add(18);
        list.add(27);
        list.add(93);
        assertEquals(3, list.size());
        list.add(6);
        assertEquals(4, list.size());
        assertFalse(list.isSorted());
	}
	@Test
	void testSorted() {
        LinkedIntList2 list2 = new LinkedIntList2();
        list2.add(18);
        list2.add(19);
        list2.add(5);
        assertFalse(list2.isSorted());//false
        
        LinkedIntList2 list3 = new LinkedIntList2();
        list3.add(18);
        list3.add(27);
        list3.add(93);
        assertTrue(list3.isSorted());	//true
	}
	
	@Test
	void testHasTwoConsecutive() {
        LinkedIntList2 list6 = new LinkedIntList2();
        list6.add(1);
        list6.add(18);
        list6.add(2);
        list6.add(7);
        list6.add(8);
        list6.add(39);
        assertTrue(list6.hasTwoConsecutive());
        LinkedIntList2 list7 = new LinkedIntList2();
        list7.add(1);
        list7.add(18);
        list7.add(2);
        list7.add(7);
        list7.add(39);
        assertFalse(list7.hasTwoConsecutive());
	}

}
