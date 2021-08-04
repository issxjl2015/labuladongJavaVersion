package org.issxjl2015.algorithm.Lc_611_有效三角形的个数;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/04/19:55
 * @Description:
 */
public class Solution2 {

    public int triangleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = 0;

        for (int i = 0; i < n; i++) {
            // nums[i] 作为第一条边
            for (int j = i + 1; j < n; j++) {
                // nums[j] 作为第二条边

                int left = j + 1, right = n - 1, pos = j;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (nums[mid] < nums[i] + nums[j]) {
                        // 找左边界
                        pos = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                // [j, pos] 为满足条件的范围
                res += pos - j;
            }
        }
        return res;
    }
}
