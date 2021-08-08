package org.issxjl2015.algorithm.Lc_15_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/08/23:03
 * @Description:
 */
public class Solution2 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            // 一样的值，跳过
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 起始值大于 0，因为升序，后面的值肯定大于 0
            if (nums[i] > 0) {
                break;
            }
            int left = i + 1, right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 一样的值，跳过
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // 一样的值，跳过
                    while (right > 2 && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = solution.threeSum(nums);
        System.out.println(ans);
    }
}
