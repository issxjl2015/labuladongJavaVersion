package org.issxjl2015.algorithm.Lc_1208_尽可能使字符串相等;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/11/22:45
 * @Description:
 */
public class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int[] preSum = new int[n + 1];
        preSum[0] = 0;
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            // 最接近 preSum[i] - maxCost的 下标
            int start = binarySerach(preSum, i, preSum[i] - maxCost);
            ans = Math.max(ans, i - start);
        }
        return ans;
    }

    private int binarySerach(int[] preSum, int endIndex, int target) {
        int l = 0, r = endIndex;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (preSum[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
