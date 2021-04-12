package org.issxjl2015.chapter4.algo_1_回溯算法解决子集集合排序问题;


import java.util.LinkedList;
import java.util.List;

public class Lc_78_子集 {
    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        backtrack(list, nums, 0);
        return ans;
    }

    public void backtrack(LinkedList<Integer> list, int[] nums, int index) {
        ans.add(new LinkedList<>(list));

        // 子集：起始点从index
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(list, nums, i + 1);
            list.removeLast();
        }
    }

}
