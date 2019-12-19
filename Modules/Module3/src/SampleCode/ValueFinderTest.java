package SampleCode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValueFinderTest {

    private ValueFinder vf;
    private int[] array1 = {3, 6, 4, 7, 1};
    private int[] array2 = {2, 4, 6, 8, 10};
    private int[] array3 = {1, 2, 3, 8, 9, 10};

    @Before
    public void setUp() throws Exception {
        vf = new ValueFinder();
    }

    @After
    public void tearDown() throws Exception {
        vf = null;
    }

    @Test
    public void findIndex() {
        assertEquals(1, vf.findIndex(6, array1));
        assertEquals(3, vf.findIndex(8, array2));
        assertEquals(2, vf.findIndex(3, array3));
        assertEquals(-1, vf.findIndex(5, array1));
    }

    @Test
    public void exists() {
        assertTrue(vf.exists(4, array2));
        assertFalse(vf.exists(5, array1));
    }

    @Test
    public void getMax() {
        assertEquals(7, vf.getMax(array1));
    }

    @Test
    public void getMin() {
        assertEquals(1, vf.getMin(array1));
    }
}