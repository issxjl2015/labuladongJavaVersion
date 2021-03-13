package org.issxjl2015.chapter4;

import org.issxjl2015.chapter4.algo_9_前缀和技巧解决子数组问题.Lc_560_和为K的子数组;
import org.junit.Assert;
import org.junit.Test;

public class Lc_560_和为K的子数组_test {

    @Test
    public void test1() {
        Lc_560_和为K的子数组 solution = new Lc_560_和为K的子数组();
        int[] nums = {1, 1, 1};
        int k = 2;
        int ans = solution.subarraySum(nums, k);
        Assert.assertEquals(2, ans);
    }
}
