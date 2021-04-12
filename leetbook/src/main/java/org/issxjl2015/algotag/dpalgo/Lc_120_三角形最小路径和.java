package org.issxjl2015.algotag.dpalgo;

import java.util.List;

public class Lc_120_三角形最小路径和 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size(), n = triangle.get(m - 1).size();
        if (m == 1 && n == 1) {
            return triangle.get(0).get(0);
        }
        int[][] triangles = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                triangles[i][j] = triangle.get(i).get(j);
            }
        }

        // 定义 dp 数组： dp[i][j] 表示 元素 triangle[i][j] 的最小路径和
        int[][] dp = new int[m][n];
        // 第一行第一个元素
        dp[0][0] = triangle.get(0).get(0);
        // 第二行
        dp[1][0] = triangles[0][0] + triangles[1][0];
        dp[1][1] = triangles[0][0] + triangles[1][1];


        for (int i = 2; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    // 最左边的元素，只能由上面的元素得到
                    dp[i][j] = dp[i - 1][j] + triangles[i][j];
                    continue;
                }
                if (j == i) {
                    // 最右边的元素，只能由上面左边的元素得到
                    dp[i][j] = dp[i - 1][j - 1] + triangles[i][j];
                    continue;
                }

                // 当前的值，肯定是由 上面或者上面左边的元素得到的
                dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangles[i][j];
            }
        }
        int ans = Integer.MAX_VALUE;
        // 最下面的dp 就是最终的路径和，取最小值即可
        for (int k = 0; k < n; k++) {
            ans = Math.min(dp[m - 1][k], ans);
        }
        return ans;
    }
}
