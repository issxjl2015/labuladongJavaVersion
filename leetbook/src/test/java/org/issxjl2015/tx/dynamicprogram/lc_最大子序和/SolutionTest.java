package org.issxjl2015.tx.dynamicprogram.lc_最大子序和;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = solution.maxSubArray1(nums);
        System.out.println(ans);
    }
}
