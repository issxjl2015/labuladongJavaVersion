package org.issxjl2015.tx.arrayandstring.lc_最接近的三数之和;

import org.issxjl2015.tx.arrayandstring.Lc_最接近的三数之和.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int ans = solution.threeSumClosest(nums, target);
        System.out.println(ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums1 = {-3,-2,-5,3,-4};
        int target1 = -1;
        int ans1 = solution.threeSumClosest(nums1, target1);
        System.out.println(ans1);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums1 = {-1,0,1,1,55};
        int target1 = 3;
        int ans1 = solution.threeSumClosest(nums1, target1);
        System.out.println(ans1);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] nums1 = {-1,2,1,-4};
        int target1 = 1;
        int ans1 = solution.threeSumClosest(nums1, target1);
        System.out.println(ans1);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] nums1 = {1,1,1,1};
        int target1 = 0;
        int ans1 = solution.threeSumClosest(nums1, target1);
        System.out.println(ans1);
    }


}
