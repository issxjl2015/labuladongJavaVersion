package org.issxjl2015.algorithm.Lc_485_最大连续1的个数;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/11/19:37
 * @Description:
 */
public class Solution2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0, r = 0;
        int ans = 0;
        int i = 0;
        while (i < nums.length) {
            // 找到所有不为0的个数
            while (i < nums.length && nums[i++] != 0) {
                r++;
            }
            ans = Math.max(ans, r - l);
            l = i;
            r = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] nums = {0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        int ans = solution.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}
