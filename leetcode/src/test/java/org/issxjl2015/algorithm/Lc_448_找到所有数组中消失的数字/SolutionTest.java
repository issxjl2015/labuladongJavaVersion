package org.issxjl2015.algorithm.Lc_448_找到所有数组中消失的数字;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = solution.findDisappearedNumbers(nums);
        Assert.assertEquals(5, (int) ans.get(0));
        Assert.assertEquals(6, (int) ans.get(1));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {1,1};
        List<Integer> ans = solution.findDisappearedNumbers(nums);
        Assert.assertEquals(2, (int) ans.get(0));
    }
}
