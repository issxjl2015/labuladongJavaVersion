package org.issxjl2015.algorithm.Lc_104_二叉树的最大深度;

import org.issxjl2015.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int ans = solution.maxDepth(root);
        Assert.assertEquals(3, ans);
    }
}
