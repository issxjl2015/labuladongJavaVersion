package org.issxjl2015.algorithm.Lc_611_有效三角形的个数;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/04/19:41
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {2,2,3,4};
        int ans = solution.triangleNumber(nums);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution2 solution = new Solution2();
        int[] nums = {2,2,3,4};
        int ans = solution.triangleNumber(nums);
        Assert.assertEquals(3, ans);
    }
}
