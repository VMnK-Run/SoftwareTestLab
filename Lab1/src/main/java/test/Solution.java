package test;

public class Solution {
    public boolean check(int x) {
        int[] price = {50, 20, 10, 5, 1};
        int[] num = {1, 1, 1, 2, 3};
        boolean result;
        int remain = x;
        for(int i = 0; i < price.length; i++) {
            int numForThis = remain / price[i];
            if(numForThis > num[i]) {
                remain -= num[i] * price[i];
            } else {
                remain -= numForThis * price[i];
            }
            if(remain == 0) {
                break;
            }
        }
        result = remain == 0;
        return result;
    }
}
