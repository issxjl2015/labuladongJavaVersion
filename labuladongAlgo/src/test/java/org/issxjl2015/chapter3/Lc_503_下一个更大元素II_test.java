package org.issxjl2015.chapter3;

import org.issxjl2015.chapter3.algo_7_特殊数据结构_单调栈.Lc_503_下一个更大元素II;
import org.junit.Assert;
import org.junit.Test;

public class Lc_503_下一个更大元素II_test {
    @Test
    public void test1() {
        Lc_503_下一个更大元素II solution = new Lc_503_下一个更大元素II();
        int[] nums = {1,2,1};
        int[] ans = solution.nextGreaterElements(nums);
        int[] expecteds = {2,-1,2};
        Assert.assertArrayEquals(expecteds, ans);
    }
}
