package lab3;

import lab3.UpgradedTriangle;
import org.junit.Test;

import static lab3.UpgradedTriangle.Type.*;
import static org.junit.Assert.*;

public class UpgradedTriangleTest {
    @Test
    public void test1() {
        assertEquals (UpgradedTriangle.classify(0,1301,1), INVALID);
    }
    @Test
    public void test2() {
        assertEquals (UpgradedTriangle.classify(1108,1,1), INVALID);
    }
    @Test
    public void test3() {
        assertEquals (UpgradedTriangle.classify(1,0,-665), INVALID);
    }
    @Test
    public void test4() {
        assertEquals (UpgradedTriangle.classify(1,1,0), INVALID);
    }
    @Test
    public void test5() {
        assertEquals (UpgradedTriangle.classify(582,582,582), EQUILATERAL);
    }
    @Test
    public void test6() {
        assertEquals (UpgradedTriangle.classify(1,1088,15), INVALID);
    }
    @Test
    public void test7() {
        assertEquals (UpgradedTriangle.classify(1,2,450), INVALID);
    }
    @Test
    public void test8() {
        assertEquals (UpgradedTriangle.classify(1663,1088,823), SCALENE);
    }
    @Test
    public void test9() {
        assertEquals (UpgradedTriangle.classify(1187,1146,1), INVALID);
    }
    @Test
    public void test10() {
        assertEquals (UpgradedTriangle.classify(1640,1640,1956), ISOSCELES);
    }
    @Test
    public void test11() {
        assertEquals (UpgradedTriangle.classify(784,784,1956), INVALID);
    }
    @Test
    public void test12() {
        assertEquals (UpgradedTriangle.classify(1,450,1), INVALID);
    }
    @Test
    public void test13() {
        assertEquals (UpgradedTriangle.classify(1146,1,1146), ISOSCELES);
    }
    @Test
    public void test14() {
        assertEquals (UpgradedTriangle.classify(1640,1956,1956), ISOSCELES);
    }
    @Test
    public void test15() {
        assertEquals (UpgradedTriangle.classify(-1,1,1), INVALID);
    }

    @Test
    public void test16() {
        assertEquals(0, UpgradedTriangle.getAera(1, 1, 8), 1e-5);
    }

    @Test
    public void test17() {
        assertEquals(0, UpgradedTriangle.getAera(-1, 1, 1), 1e-5);
    }

    @Test
    public void test18() {
        assertEquals(6, UpgradedTriangle.getAera(3, 4, 5), 1e-5);
    }

    @Test
    public void test19() {
        assertEquals(24, UpgradedTriangle.getAera(6, 8, 10), 1e-5);
    }

    @Test
    public void test20() {
        assertEquals(0, UpgradedTriangle.getAera(6, 10, 22), 1e-5);
    }

    @Test
    public void test21() {
        assertEquals(0, UpgradedTriangle.getAera(1, 1, 8), 1e-5);
    }

    @Test
    public void test22() {
        assertEquals(0, UpgradedTriangle.getAera(1, 1, 8), 1e-5);
    }

    @Test
    public void test23() {
        assertEquals(0, UpgradedTriangle.getAera(1, 1, 8), 1e-5);
    }
}