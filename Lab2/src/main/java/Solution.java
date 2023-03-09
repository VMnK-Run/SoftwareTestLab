public class Solution {
    public int getMaxProduct(int x) {
        int[] dp = new int[x + 5];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 2; i <= x; i++) {  // 一直求到 x
            dp[i] = dp[i - 1]; // 初始化
            for (int j = 1; j <= i; j++) {  // 求解每个 j 时使用拆分的思路
                int split = Math.max(j * (i - j), j * dp[i - j]);  // 两种拆分方式
                dp[i] = Math.max(dp[i], split);  // 拆分当前值或者不拆分
            }
        }
        return dp[x];
    }
}
