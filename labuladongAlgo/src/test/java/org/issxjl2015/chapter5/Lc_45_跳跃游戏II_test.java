package org.issxjl2015.chapter5;

import org.issxjl2015.chapter5.algo_7_如何运用贪心思想玩跳跃游戏.Lc_45_跳跃游戏II;
import org.junit.Assert;
import org.junit.Test;

public class Lc_45_跳跃游戏II_test {

    @Test
    public void test1() {
        Lc_45_跳跃游戏II solution = new Lc_45_跳跃游戏II();
        int[] nums = {2,3,1,1,4};
        int ans = solution.jump(nums);
        Assert.assertEquals(2, ans);
    }
}
