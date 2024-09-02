import org.testng.annotations.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayEqualityTest {
    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = {2, 3, 5, 7};
        int[] a2 = {2, 3, 5, 7, 8};
        assertArrayEquals("Should be equal", a1, a2);
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = {{2, 3}, {5, 7}, {11, 13}};
        int[][] a12 = {{2, 3}, {5, 7}, {11, 14}};
        assertArrayEquals("Should not be equal", a11, a12);
    }
}