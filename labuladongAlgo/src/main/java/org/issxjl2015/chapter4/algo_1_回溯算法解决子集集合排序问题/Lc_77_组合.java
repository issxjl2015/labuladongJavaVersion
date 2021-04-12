package org.issxjl2015.chapter4.algo_1_回溯算法解决子集集合排序问题;

import java.util.LinkedList;
import java.util.List;

public class Lc_77_组合 {
    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        backtrack(list, nums, 0, k);
        return ans;
    }

    public void backtrack(LinkedList<Integer> list, int[] nums, int index, int k) {
        if (list.size() == k) {
            ans.add(new LinkedList<>(list));
            return;
        }

        // 组合：遍历的起始点是 index
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(list, nums, i + 1, k);
            list.removeLast();
        }
    }
}
