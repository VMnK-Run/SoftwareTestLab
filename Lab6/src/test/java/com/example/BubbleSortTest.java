package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class BubbleSortTest {
    BubbleSort bubbleSort;

    @Before
    public void setUp() {
        this.bubbleSort = new BubbleSort();
    }

    @Test
    public void test1() {
        int[] input = new int[] {3, 2, 1, 7, 6, 5, 4};
        int[] result = new int[] {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(result, this.bubbleSort.sort(input));
    }

    @After
    public void tearDown() {

    }
}