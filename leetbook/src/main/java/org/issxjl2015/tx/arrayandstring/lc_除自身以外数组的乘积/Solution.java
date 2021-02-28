package org.issxjl2015.tx.arrayandstring.lc_除自身以外数组的乘积;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        // 当前值的左边值的积
        int[] before = new int[len];
        // 当前值的右边值的积
        int[] after = new int[len];
        before[0] = 1;
        after[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            before[i] = before[i - 1] * nums[i - 1];
        }
        ans[len - 1] = before[len - 1] * after[len - 1];

        for (int j = len - 2; j >= 0; j--) {
            after[j] = after[j + 1] * nums[j + 1];
            // 除自身以外数组的乘积 = 当前值左边的乘积 * 当前值右边的乘积
            ans[j] = after[j] * before[j];
        }

        return ans;
    }
}
