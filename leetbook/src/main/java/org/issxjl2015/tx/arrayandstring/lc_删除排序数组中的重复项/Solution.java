package org.issxjl2015.tx.arrayandstring.lc_删除排序数组中的重复项;

public class Solution {

    /**
     * 双指针解法：
     * 1、index 表示的是实际不重复数组的下标
     * 2、遍历数组，比较nums[i] 和 nums[index]
     *      1） 不相等时，index++， 同时将 nums[i] 赋值给 nums[index]
     * 3、最终不重复的数组就是 index + 1
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

}
