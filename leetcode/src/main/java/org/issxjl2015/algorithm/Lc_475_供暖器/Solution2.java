package org.issxjl2015.algorithm.Lc_475_供暖器;

import java.util.Arrays;

public class Solution2 {
    public int findRadius(int[] houses, int[] heaters) {
        int ans = 0, n = heaters.length;
        Arrays.sort(houses);
        Arrays.sort(heaters);

        for (int house : houses) {
            int left = 0, right = n - 1;
            // 找目标元素 第一次 出现的位置
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (heaters[mid] < house) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            // 供暖器在房子右边
            int dist1 = (left == n) ? Integer.MAX_VALUE : heaters[left] - house;
            // 供暖器在房子的左边
            int dist2 = (left == 0) ? Integer.MAX_VALUE : house - heaters[right];
            // 距离最近的供暖器纳入统计
            ans = Math.max(ans, Math.min(dist1, dist2));
        }
        return ans;
    }
}
