package org.issxjl2015.tx.arrayandstring.lc_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和：
 * 1、将数组按照从小到大排序
 * 2、利用三指针解法，第一个指针是遍历数组的下标，第二个指针是下标的右边第一个索引，第三个指针是数组的最后一个数的索引
 * 3、计算三数之和，是否符合要求
 * 4、符合要求，则将三个数作为答案加入到ans。同时，对l右侧相等的值，进行跳过；对r左侧相等的值，进行跳过
 * 5、不符合要求的，大于0的，对指针r进行左移；小于0的，对指针l进行右移
 * 6、注意点：两处需要跳过：
 * 1）遍历时，如果遍历的元素本身即大于0了，没必要进行下一步的计算； 因为已经进行了排序，后面的肯定比当前元素要大，肯定不符合要求
 * 2)符合三数之和为0时，可能会存在一些元素相同，所以要将相同的值进行跳过，比如：-1 -1
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        // 按照从小到大排序
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0 && (i > 0 && nums[i] == nums[i - 1])) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            // 以 i 为起点，进行遍历后续的元素， l 和 r 根据不同情况进行夹逼
            while (l < r) {
                // 每次的元素和
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[l], nums[r]);
                    ans.add(list);
                    // 一样的值，跳过
                    while (l < nums.length - 3 && (nums[l] == nums[l + 1])) {
                        l++;
                    }
                    // 一样的值，跳过
                    while (r > 2 && (nums[r] == nums[r - 1])) {
                        r--;
                    }
                    l++;
                    r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }
}
