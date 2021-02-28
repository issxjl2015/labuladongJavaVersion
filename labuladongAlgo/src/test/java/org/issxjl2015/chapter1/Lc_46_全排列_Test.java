package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_3_回溯算法解题套路框架.Lc_46_全排列;
import org.junit.Test;

import java.util.List;

public class Lc_46_全排列_Test {

    @Test
    public void test1() {
        Lc_46_全排列 solution = new Lc_46_全排列();
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = solution.permute(nums);
        System.out.println(ans);
    }
}
