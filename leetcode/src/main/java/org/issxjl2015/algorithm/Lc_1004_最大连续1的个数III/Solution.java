package org.issxjl2015.algorithm.Lc_1004_最大连续1的个数III;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/11/20:02
 * @Description:
 */
public class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int l = 0, r = 0;
        int start = 0, end = 0;
        int cnt = 0;

        while (r < nums.length) {
            int rightValue = nums[r];
            r++;
            // 0的个数
            if (rightValue == 0) {
                cnt++;
            }
            // 0的个数等于 k，则判断长度
            if (cnt == k) {
                if (r - l > ans) {
                    ans = r - l;
                    end = r;
                    start = l;
                }
            }
            // 0的个数大于 k，需要左移指针
            while (cnt > k) {
                int valueLeft = nums[l];
                l++;
                if (valueLeft == 0) {
                    cnt--;
                }
            }
        }
        return cnt < k ? nums.length : end - start;
    }
}
