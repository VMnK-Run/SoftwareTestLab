package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    public Solution solution;

    @Before
    public void setUp() {
        this.solution = new Solution();
    }

    @Test
    public void test1() {
        assertTrue(solution.check(3));
    }

    @Test
    public void test2() {
        assertTrue(solution.check(93));
    }

    @Test
    public void test3() {
        assertTrue(solution.check(91));
    }

    @Test
    public void test4() {
        assertFalse(solution.check(94));
    }

    @Test
    public void test5() {
        assertFalse(solution.check(19));
    }

    @Test
    public void test6() {
        assertFalse(solution.check(4));
    }

    @Test
    public void test7() {
        assertEquals(true, solution.check(58));
    }

    @Test
    public void test8() {
        assertEquals(true, solution.check(12));
    }

    @Test
    public void test9() {
        assertEquals(false, solution.check(100));
    }

    @After
    public void tearDown() {

    }
}