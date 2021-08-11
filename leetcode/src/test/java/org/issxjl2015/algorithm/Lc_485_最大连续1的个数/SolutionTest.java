package org.issxjl2015.algorithm.Lc_485_最大连续1的个数;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/11/19:46
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int ans = solution.findMaxConsecutiveOnes(nums);
        Assert.assertEquals(3, ans);
    }
}
