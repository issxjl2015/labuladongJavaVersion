package org.issxjl2015.algorithm.Lc_111_二叉树的最小深度;

import org.issxjl2015.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution solution = new Solution();
        int ans = solution.minDepth(root);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.left.left = new TreeNode(7);
        Solution solution = new Solution();
        int ans = solution.minDepth(root);
        Assert.assertEquals(5, ans);
    }
}
