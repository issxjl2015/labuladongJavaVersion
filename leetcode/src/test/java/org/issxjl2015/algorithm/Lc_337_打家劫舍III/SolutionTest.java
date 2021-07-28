package org.issxjl2015.algorithm.Lc_337_打家劫舍III;

import org.issxjl2015.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/28/22:37
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(1);

        Solution solution = new Solution();
        int ans = solution.rob(root);
        Assert.assertEquals(7, ans);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(1);

        Solution solution = new Solution();
        int ans = solution.rob(root);
        Assert.assertEquals(9, ans);
    }
}
