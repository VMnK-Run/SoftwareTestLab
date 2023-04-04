package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackPackTest {
    BackPack backPack;

    @Before
    public void setUp() {
        this.backPack = new BackPack();
    }

    @Test
    public void test1() {
        int capacity = 100;
        int[] weight = new int[] {77, 22, 29, 50, 99};
        int[] price = new int[] {92, 22, 87, 46, 90};
        int value = 133;
        assertEquals(value, this.backPack.getMaxValue(weight, price, capacity));
    }

    @After
    public void tearDown() {

    }

}