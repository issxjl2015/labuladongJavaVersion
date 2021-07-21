package org.issxjl2015.algorithm.Lc_90_子集II;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        Arrays.sort(nums);
        dfs(track, nums, 0);
        return ans;
    }

    private void dfs(LinkedList<Integer> track, int[] nums, int index) {
        ans.add(new LinkedList<>(track));
        Set<Integer> set = new HashSet<>();

        for (int i = index; i < nums.length; i++) {
            // 去重
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            track.add(nums[i]);
            dfs(track, nums, i + 1);
            track.removeLast();
        }
    }
}
