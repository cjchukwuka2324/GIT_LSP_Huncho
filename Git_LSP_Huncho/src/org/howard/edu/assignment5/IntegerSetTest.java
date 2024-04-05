package org.howard.edu.assignment5;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {

    private IntegerSet setA;

    @BeforeEach
    public void setUp() {
        setA = new IntegerSet();
        setA.add(1);
        setA.add(2);
        setA.add(3);
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        setA.clear();
        assertTrue(setA.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(3, setA.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet setB = new IntegerSet();
        setB.add(3);
        setB.add(2);
        setB.add(1);
        assertTrue(setA.equals(setB));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        assertTrue(setA.contains(2));
        assertFalse(setA.contains(4));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        try {
			assertEquals(3, setA.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

   
    @Test
	@DisplayName("Test case for when IntegerSet.largest() throws an IntegerSetExeption")
	public void testLargestEmptySet() {
		IntegerSet set1 = new IntegerSet();
		IntegerSetException exception = assertThrows(IntegerSetException.class, () -> {
			System.out.println(set1.largest());
		});
		// testing that largest throws an IntegerSetException when called on an empty set.
		assertEquals("Error calling largest(). The IntegerSet is empty.", exception.getMessage());
	}

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        try {
			assertEquals(1, setA.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

  
    @Test
   	@DisplayName("Test case for when IntegerSet.largest() throws an IntegerSetExeption")
   	public void testSmallestEmptySet() {
   		IntegerSet set1 = new IntegerSet();
   		IntegerSetException exception = assertThrows(IntegerSetException.class, () -> {
   			System.out.println(set1.smallest());
   		});
   		// testing that smallest throws an IntegerSetException when called on an empty set.
   		assertEquals("Error calling smallest(). The IntegerSet is empty.", exception.getMessage());
   	}
    
    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        setA.add(4);
        assertTrue(setA.contains(4));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        setA.remove(2);
        assertFalse(setA.contains(2));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet setB = new IntegerSet();
        setB.add(2);
        setB.add(4);
        setA.union(setB);
        assertTrue(setA.contains(4));
    }

    @Test
    @DisplayName("Test case for intersection")
    public void testIntersect() {
        IntegerSet setB = new IntegerSet();
        setB.add(2);
        setB.add(3);
        setA.intersect(setB);
        assertFalse(setA.contains(1));
    }

    @Test
    @DisplayName("Test case for difference")
    public void testDiff() {
        IntegerSet setB = new IntegerSet();
        setB.add(2);
        setB.add(3);
        setA.diff(setB);
        assertTrue(setA.contains(1));
        assertFalse(setA.contains(3));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertFalse(setA.isEmpty());
        setA.clear();
        assertTrue(setA.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        assertEquals("[1, 2, 3]", setA.toString());
    }
}
