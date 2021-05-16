package org.issxjl2015.contest.weeklycontest.weeklycontest240.algo_5751_下标对中的最大距离;

public class Solution {

    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = nums2.length - 1; j >= i; j--) {
                if (nums2[j] >= nums1[i]) {
                    max = Math.max(j - i, max);
                    break;
                }
            }
        }
        return max;
    }
}
