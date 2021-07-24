package org.issxjl2015.algorithm.Lc_475_供暖器;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution2 solution = new Solution2();
        int[] houses = {1, 5};
        int[] heaters = {10};
        int ans = solution.findRadius(houses, heaters);
        Assert.assertEquals(9, ans);
    }
}
