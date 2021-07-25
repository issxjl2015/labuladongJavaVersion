package org.issxjl2015.algorithm.Lc_474_一和零;

/**
 * 很有意思的一道 0-1 背包问题
 */
public class Solution {

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (String str : strs) {
            int zeroNum = compute(str)[0];
            int oneNum = compute(str)[1];
            // 相当于之前的背包的容量，现在变成了两个维度，一个是zero，一个是one
            // 你可以理解为之前的背包是一个手提袋，现在的背包变成了书包，有两个格子，一个格子放 0， 一个格子放 1
            for (int i = m; i >= zeroNum; i--) {
                for (int j = n; j >= oneNum; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
                }
            }
        }
        return dp[m][n];
    }

    private int[] compute(String s) {
        int[] nums = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                nums[0]++;
            } else {
                nums[1]++;
            }
        }
        return nums;
    }

}
