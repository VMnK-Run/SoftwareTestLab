package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BubbleSortTest {
    private BubbleSort bubbleSort;
    private int[] input;
    private int[] expected;

    public BubbleSortTest(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        this.bubbleSort = new BubbleSort();
    }

    @Parameterized.Parameters
    public static List<int[][]> parameters() throws IOException {
        InputStreamReader inputStreamReader = null;
        File f = new File("D:\\TJU\\22232\\SoftwareTest\\SoftwareTestLab\\Lab6\\src\\test\\resources\\BubbleSort.txt");
        try {
            inputStreamReader = new InputStreamReader(new
                    FileInputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<int[][]> list = new ArrayList<>();
        assert inputStreamReader != null;
        BufferedReader in = new BufferedReader(inputStreamReader);
        String tmp = "";
        tmp = in.readLine();
        while (tmp != null && !tmp.equals("")) {
            tmp = tmp.replace(" ", "");
            String[] arr = tmp.split(";");
            String[] left = arr[0].split(",");
            String[] right = arr[1].split(",");
            int[] leftArray = Arrays.stream(left).mapToInt(Integer::parseInt).toArray();
            int[] rightArray = Arrays.stream(right).mapToInt(Integer::parseInt).toArray();
            int[][] item = {leftArray,rightArray};
            list.add(item);
            tmp = in.readLine();
        }
        return list;
    }
    @Test
    public void testAll() {
        assertArrayEquals(this.expected, this.bubbleSort.sort(this.input));
    }

    @After
    public void tearDown() {

    }
}