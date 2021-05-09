package org.issxjl2015.contest.weeklycontest.weeklycontest240;

import org.issxjl2015.contest.weeklycontest.weeklycontest240.algo_5750_人口最多的年份.Solution;
import org.junit.Assert;
import org.junit.Test;

public class algo_5750_人口最多的年份_test {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] logs = {{1993, 1999}, {2000, 2010}};
        int ans = solution.maximumPopulation(logs);
        Assert.assertEquals(1993, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        int ans = solution.maximumPopulation(logs);
        Assert.assertEquals(1960, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[][] logs = {{1993,2050},{2000,2010}};
        int ans = solution.maximumPopulation(logs);
        Assert.assertEquals(2000, ans);
    }
}
