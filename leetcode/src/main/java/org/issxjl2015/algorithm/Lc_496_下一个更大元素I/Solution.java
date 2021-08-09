package org.issxjl2015.algorithm.Lc_496_下一个更大元素I;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/09/23:21
 * @Description:
 */
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 0; i < n; i++) {
            int j = map.get(nums1[i]);
            for (; j < nums2.length; j++) {
                if (nums1[i] < nums2[j]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}
