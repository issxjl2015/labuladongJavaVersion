package org.issxjl2015.algorithm.Lc_88_合并两个有序数组;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/03/22:43
 * @Description:
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}
