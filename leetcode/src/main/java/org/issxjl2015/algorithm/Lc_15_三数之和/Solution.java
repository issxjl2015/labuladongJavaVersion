package org.issxjl2015.algorithm.Lc_15_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int num = nums[i] + nums[left] + nums[right];
                if (num == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    ans.add(list);
                    while (left < nums.length - 3 && (nums[left] == nums[left + 1])) {
                        left++;
                    }

                    while (right > 2 && (nums[right] == nums[right - 1])) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (num > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return ans;
    }
}
