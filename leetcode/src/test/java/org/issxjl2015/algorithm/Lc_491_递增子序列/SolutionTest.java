package org.issxjl2015.algorithm.Lc_491_递增子序列;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {4, 6, 7, 7};
        List<List<Integer>> ans = solution.findSubsequences(nums);
        System.out.println(ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7,8,9,10,1,1,1,1,1};
        List<List<Integer>> ans = solution.findSubsequences(nums);
        System.out.println(ans);
    }

}
