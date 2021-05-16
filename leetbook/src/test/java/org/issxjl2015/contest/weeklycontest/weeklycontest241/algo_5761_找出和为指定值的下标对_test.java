package org.issxjl2015.contest.weeklycontest.weeklycontest241;

import org.issxjl2015.contest.weeklycontest.weeklycontest241.algo_5761_找出和为指定值的下标对.FindSumPairs;
import org.junit.Assert;
import org.junit.Test;

public class algo_5761_找出和为指定值的下标对_test {

    @Test
    public void test1() {
        int[] num1 = {1, 1, 2, 2, 2, 3};
        int[] num2 = {1, 4, 5, 2, 5, 4};
        FindSumPairs solution = new FindSumPairs(num1, num2);
        int cnt1 = solution.count(7);
        Assert.assertEquals(8, cnt1);
        solution.add(3, 2);
        int cnt2 = solution.count(8);
        Assert.assertEquals(2, cnt2);
        int cnt3 = solution.count(4);
        Assert.assertEquals(1, cnt3);
        solution.add(0, 1);
        solution.add(1, 1);
        int cnt4 = solution.count(7);
        Assert.assertEquals(11, cnt4);
    }
}
