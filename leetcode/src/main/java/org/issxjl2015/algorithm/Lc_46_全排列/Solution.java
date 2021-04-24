package org.issxjl2015.algorithm.Lc_46_全排列;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        dfs(nums, track);
        return ans;
    }

    private void dfs(int[] nums, LinkedList<Integer> track) {
        // 触发结束条件
        if (track.size() == nums.length) {
            ans.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            // 做选择
            track.add(nums[i]);
            // 进入下一层决策树
            dfs(nums, track);
            // 取消选择
            track.removeLast();
        }
    }
}
