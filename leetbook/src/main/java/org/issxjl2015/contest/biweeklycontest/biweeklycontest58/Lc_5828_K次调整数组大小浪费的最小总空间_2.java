package org.issxjl2015.contest.biweeklycontest.biweeklycontest58;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/08/22:14
 * @Description:
 */
public class Lc_5828_K次调整数组大小浪费的最小总空间_2 {
    public int minSpaceWastedKResizing(int[] nums, int k) {
        k++;
        int n = nums.length, INF = Integer.MAX_VALUE / 2;
        int[][] f = new int[n + 1][k + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(f[i], INF);
        }
        f[0][0] = 0;
        // 前缀和
        int[] s = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + nums[i - 1];
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i && j <= k; j++) {
                for (int u = i, h = 0; u >= 0; u--) {
                    h = Math.max(h, nums[u - 1]);
                    f[i][j] = Math.min(f[i][j], f[u - 1][j - 1] + h * (i - u + 1) - (s[i] - s[u - 1]));
                }
            }
        }
        return f[n][k];
    }
}
