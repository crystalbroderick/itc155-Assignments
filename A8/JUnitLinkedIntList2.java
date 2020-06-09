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
        System.out.println(list3);
        System.out.println(list3.isSorted());	//true
	}

}
