package org.issxjl2015.chapter5;

import org.issxjl2015.chapter5.algo_7_如何运用贪心思想玩跳跃游戏.Lc_55_跳跃游戏;
import org.junit.Assert;
import org.junit.Test;

public class Lc_55_跳跃游戏_test {

    @Test
    public void test1() {
        Lc_55_跳跃游戏 solution = new Lc_55_跳跃游戏();
        int[] nums = {2,3,1,1,4};
        boolean ans = solution.canJump(nums);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        Lc_55_跳跃游戏 solution = new Lc_55_跳跃游戏();
        int[] nums = {3,2,1,0,4};
        boolean ans = solution.canJump(nums);
        Assert.assertFalse(ans);
    }
}
