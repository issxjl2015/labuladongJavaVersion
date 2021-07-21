package org.issxjl2015.algorithm.Lc_491_递增子序列;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        dfs(track, nums, 0);
        return ans;
    }

    private void dfs(LinkedList<Integer> track, int[] nums, int index) {
        if (track.size() > 1) {
            ans.add(new LinkedList<>(track));
        }

        Set<Integer> set = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            // track 不为空时，如果 nums[i] 小于 track的最后一个元素 或者 本层元素使用过，则跳过
            // nums[i] >= track.getLast() 是因为题目要求递增
            if ((!track.isEmpty() && nums[i] < track.getLast())
                    || set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            track.add(nums[i]);
            dfs(track, nums, i + 1);
            track.removeLast();
        }
    }

}
