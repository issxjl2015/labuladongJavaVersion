package org.issxjl2015.tx.arrayandstring.lc_三数之和;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
//       int[] nums = {-1,0,1,2,-1,-4};
       int[] nums = {0,0,0};
       Solution solution = new Solution();
       List<List<Integer>> ans = solution.threeSum(nums);
       Assert.assertEquals(ans.size(), 2);
       System.out.println(ans.get(0).toString());
       System.out.println(ans.get(1).toString());

    }
}
