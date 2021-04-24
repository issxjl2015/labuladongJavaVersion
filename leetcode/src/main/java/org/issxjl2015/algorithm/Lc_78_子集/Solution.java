package org.issxjl2015.algorithm.Lc_78_子集;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        dfs(nums, track, 0);
        return ans;
    }

    private void dfs(int[] nums, LinkedList<Integer> track, int index) {
        ans.add(new LinkedList<>(track));

        for (int i = index; i < nums.length; i++) {
            // 做选择
            track.add(nums[i]);
            // 进入下一层决策树
            dfs(nums, track, index + 1);
            // 撤销选择
            track.removeLast();
        }
    }
}
