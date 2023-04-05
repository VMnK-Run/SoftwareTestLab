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
public class BackPackTest {
    private BackPack backPack;
    private int[] weight;
    private int[] price;
    private int capacity;
    private int expected;

    public BackPackTest(int[] capacityAndExpected, int[] weight, int[] price) {
        this.capacity = capacityAndExpected[0];
        this.weight = weight;
        this.price = price;
        this.expected = capacityAndExpected[1];
    }

    @Parameterized.Parameters
    public static List<int[][]> parameters() throws IOException {
        InputStreamReader inputStreamReader = null;
        File f = new File("D:\\TJU\\22232\\SoftwareTest\\SoftwareTestLab\\Lab6\\src\\test\\resources\\BackPack.txt");
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<int[][]> list = new ArrayList<>();
        assert inputStreamReader != null;
        BufferedReader in = new BufferedReader(inputStreamReader);
        String tmp;
        tmp = in.readLine();
        while (tmp != null && !tmp.equals("")) {
            if(!Character.isDigit(tmp.charAt(0))) {
                tmp = in.readLine();
                continue;
            }
            tmp = tmp.replace(" ", "");
            String[] arr = tmp.split(";");
            String capacityString = arr[0];
            String[] weightString = arr[1].split(",");
            String[] priceString = arr[2].split(",");
            String valueString = arr[3];
            int[] capacityAndExpected = new int[] {Integer.parseInt(capacityString), Integer.parseInt(valueString)};
            int[] weight = Arrays.stream(weightString).mapToInt(Integer::parseInt).toArray();
            int[] price = Arrays.stream(priceString).mapToInt(Integer::parseInt).toArray();
            int[][] item = {capacityAndExpected, weight, price};
            list.add(item);
            tmp = in.readLine();
        }
        return list;
    }

    @Before
    public void setUp() {
        this.backPack = new BackPack();
    }

    @Test
    public void testAll() {
        assertEquals(this.expected, this.backPack.getMaxValue(this.weight, this.price, this.capacity));
    }

    @After
    public void tearDown() {

    }

}