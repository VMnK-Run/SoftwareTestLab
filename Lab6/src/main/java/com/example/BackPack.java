package com.example;

public class BackPack {
    public int getMaxValue(int[] weight, int[] price, int capacity) {
        int[] dp = new int[capacity + 5];
        for(int i = 0; i < weight.length; i++) {
            for(int j = capacity; j >= 1; j--) {
                if(j >= weight[i]) {
                    dp[j] = Math.max(dp[j], dp[j - weight[i]] + price[i]);
                }
            }
        }
        return dp[capacity];
    }
}
