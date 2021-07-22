package org.issxjl2015.algorithm.Lc_62_不同路径;

/**
 * 1、dp[m - 1][n - 1] 表示：到达 (m - 1, n - 1) 有 dp[m - 1][n - 1] 种方法
 * 2、dp[m - 1][n - 1] = dp[m - 2][n - 1] + dp[m - 1][n - 2]
 * 3、初始化：
 *      1）dp[1][1]=1
 *      2）dp[i][n] = dp[m][1] = 1
 * 4、数组遍历顺序： 左上角 -> 右下角
 *
 */
public class Solution {

    public int uniquePaths(int m, int n) {
        // 定义dp数组：dp[m][n]表示到达（m，n）点有 dp[m][n] 种方法
        int[][] dp = new int[m + 1][n + 1];
        // 初始化
        dp[1][1] = 1;
        for (int i = 1; i <= m; i++) {
            dp[i][1] = 1;
        }
        for (int i = 1; i <= n; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                // 递推公式
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m][n];
    }
}
