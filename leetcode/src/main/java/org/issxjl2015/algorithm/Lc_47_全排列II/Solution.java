package org.issxjl2015.algorithm.Lc_47_全排列II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    // 数组用来存放是否已访问的标识
    Boolean[] visits;
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> track = new LinkedList<>();
        visits = new Boolean[nums.length];
        // 初始化一下 visits
        Arrays.fill(visits, false);
        Arrays.sort(nums);
        dfs(ans, track, nums, 0);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, List<Integer> track, int[] nums, int index) {
        if (index == nums.length) {
            ans.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // 访问过的元素 或者 （没有被访问过，但是 该元素和前一个元素是相同的） 都直接忽略
            if (visits[i] || (i > 0 && nums[i] == nums[i - 1] && !visits[i - 1])) {
                continue;
            }

            track.add(nums[i]);
            visits[i] = true;
            dfs(ans, track, nums, index + 1);
            visits[i] = false;
            track.remove(index);
        }
    }
}
