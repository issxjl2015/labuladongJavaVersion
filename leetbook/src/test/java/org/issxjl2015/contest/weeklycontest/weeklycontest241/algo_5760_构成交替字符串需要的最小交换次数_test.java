package org.issxjl2015.contest.weeklycontest.weeklycontest241;

import org.issxjl2015.contest.weeklycontest.weeklycontest241.algo_5760_构成交替字符串需要的最小交换次数.Solution;
import org.junit.Assert;
import org.junit.Test;

public class algo_5760_构成交替字符串需要的最小交换次数_test {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "111000";
        int ans = solution.minSwaps(s);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "010";
        int ans = solution.minSwaps(s);
        Assert.assertEquals(0, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s = "1110";
        int ans = solution.minSwaps(s);
        Assert.assertEquals(-1, ans);
    }
}
