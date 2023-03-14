package lab3;

import org.junit.Test;

import static lab3.UpgradedTriangle.Type.*;
import static org.junit.Assert.*;

public class UpgradedTriangleTest {
    @Test
    public void test0() {
        assertEquals (UpgradedTriangle.classify(0,0,0), INVALID);
    }
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
        assertEquals(0, UpgradedTriangle.getArea(1, 1, 8), 1e-5);
    }
    @Test
    public void test17() {
        assertEquals(0, UpgradedTriangle.getArea(-1, 1, 1), 1e-5);
    }
    @Test
    public void test18() {
        assertEquals(6, UpgradedTriangle.getArea(3, 4, 5), 1e-5);
    }
    @Test
    public void test19() {
        assertEquals(24, UpgradedTriangle.getArea(6, 8, 10), 1e-5);
    }
    @Test
    public void test20() {
        assertEquals(0, UpgradedTriangle.getArea(6, 10, 22), 1e-5);
    }
    @Test
    public void test21() {
        assertEquals(389.711431702, UpgradedTriangle.getArea(30, 30, 30), 1e-5);
    }
    @Test
    public void test22() {
        assertEquals(600, UpgradedTriangle.getArea(30, 40, 50), 1e-5);
    }
    @Test
    public void test23() {
        assertEquals(30, UpgradedTriangle.getArea(5, 12, 13), 1e-5);
    }

    @Test
    public void test24() {
        assertEquals(2400, UpgradedTriangle.getArea(60, 80, 100), 1e-5);
    }
    @Test
    public void test25() {
        assertEquals(0, UpgradedTriangle.getArea(50, 19, 30), 1e-5);
    }
    @Test
    public void test26() {
        assertEquals(0, UpgradedTriangle.getArea(-5, 12, 13), 1e-5);
    }
    @Test
    public void test27() {
        assertEquals(74.8331477354, UpgradedTriangle.getArea(15, 12, 13), 1e-5);
    }
    @Test
    public void test28() {
        assertEquals(0, UpgradedTriangle.getArea(-5, -12, -13), 1e-5);
    }
    @Test
    public void test29() {
        assertEquals(0.43301270189, UpgradedTriangle.getArea(1, 1, 1), 1e-5);
    }
    @Test
    public void test30() {
        assertEquals(2.90473750965, UpgradedTriangle.getArea(2, 3, 4), 1e-5);
    }

}