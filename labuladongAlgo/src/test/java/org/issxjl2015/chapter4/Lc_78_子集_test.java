package org.issxjl2015.chapter4;

import org.issxjl2015.chapter4.algo_1_回溯算法解决子集集合排序问题.Lc_78_子集;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class Lc_78_子集_test {

    @Test
    public void test1() {
        Lc_78_子集 solution = new Lc_78_子集();
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = solution.subsets(nums);
        System.out.println(ans);
    }

    @Test
    public void test2() {
        Lc_78_子集 solution = new Lc_78_子集();
        int[] nums = {1};
        List<List<Integer>> ans = solution.subsets(nums);
        System.out.println(ans);
    }
}
