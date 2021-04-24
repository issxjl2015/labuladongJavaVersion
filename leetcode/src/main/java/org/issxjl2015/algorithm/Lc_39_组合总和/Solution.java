package org.issxjl2015.algorithm.Lc_39_组合总和;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> track = new LinkedList<>();
        dfs(candidates, track, 0, target);
        return ans;
    }

    private void dfs(int[] candidates, LinkedList<Integer> track, int sum, int target) {
        // 触发结束
        if (sum == target) {
            ans.add(new LinkedList<>(track));
            return;
        } else if (sum > target) {
            return;
        }

        int lastValue = track.size() == 0 ? Integer.MIN_VALUE : track.getLast();
        for (int candidate : candidates) {
            if (candidate < lastValue) {
                continue;
            }
            // 做选择
            track.add(candidate);
            sum += candidate;
            // 进入下一层决策树
            dfs(candidates, track, sum, target);
            // 撤销选择
            track.removeLast();
            sum -= candidate;
        }
    }
}
