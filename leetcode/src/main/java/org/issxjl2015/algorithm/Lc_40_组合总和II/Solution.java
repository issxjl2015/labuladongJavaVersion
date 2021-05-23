package org.issxjl2015.algorithm.Lc_40_组合总和II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> track = new LinkedList<>();
        Arrays.sort(candidates);
        dfs(candidates, track, target, 0, 0);
        return ans;
    }

    private void dfs(int[] cadidates, List<Integer> track, int target, int sum, int index) {
        // sum 等于 target时，加入结果中
        if (sum == target) {
            ans.add(new ArrayList<>(track));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < cadidates.length; i++) {
            // 排序后，当前位置一样的，放一样的值，是无效的情况
            if (i > index && cadidates[i] == cadidates[i - 1]) {
                continue;
            }
            // 做选择
            track.add(cadidates[i]);
            // 进入下一层决策树
            dfs(cadidates, track, target, sum + cadidates[i], i + 1);
            // 撤销选择
            track.remove(track.size() - 1);
        }
    }
}
