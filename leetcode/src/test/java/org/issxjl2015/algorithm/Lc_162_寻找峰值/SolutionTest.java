package org.issxjl2015.algorithm.Lc_162_寻找峰值;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/09/23:18
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        int ans = solution.findPeakElement(nums);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {1,2,1,3,5,6,4};
        int ans = solution.findPeakElement(nums);
        Assert.assertEquals(1, ans);
    }
}
