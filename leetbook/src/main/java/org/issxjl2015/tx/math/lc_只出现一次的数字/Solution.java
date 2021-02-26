package org.issxjl2015.tx.math.lc_只出现一次的数字;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
                continue;
            }
            set.add(nums[i]);
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4,1,2,1,2};
        int ans = solution.singleNumber(nums);
        System.out.println(ans);
    }
}
