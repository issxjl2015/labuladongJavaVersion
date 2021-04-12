package org.issxjl2015.chapter4.algo_1_回溯算法解决子集集合排序问题;

import java.util.LinkedList;
import java.util.List;

public class Lc_46_全排列 {
    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return ans;
    }

    public void backtrack(int[] nums, LinkedList<Integer> track) {
        if (nums.length == track.size()) {
            ans.add(new LinkedList(track));
            return;
        }
        // 全排列：起始点是 从 0 开始的
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            track.add(nums[i]);
            backtrack(nums, track);
            track.removeLast();
        }
    }
}
