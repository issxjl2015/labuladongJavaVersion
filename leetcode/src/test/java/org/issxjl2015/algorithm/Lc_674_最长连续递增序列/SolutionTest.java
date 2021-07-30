package org.issxjl2015.algorithm.Lc_674_最长连续递增序列;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/30/22:36
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1,3,5,4,7};
        int ans = solution.findLengthOfLCIS(nums);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {2,2,2,2,2};
        int ans = solution.findLengthOfLCIS(nums);
        Assert.assertEquals(1, ans);
    }
}
