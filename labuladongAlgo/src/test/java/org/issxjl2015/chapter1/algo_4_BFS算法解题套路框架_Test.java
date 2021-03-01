package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_4_BFS算法解题套路框架.Lc_111_二叉树的最小深度;
import org.issxjl2015.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class algo_4_BFS算法解题套路框架_Test {

    @Test
    public void test1() {
        // 构建一棵树
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Lc_111_二叉树的最小深度 solution = new Lc_111_二叉树的最小深度();
        int ans = solution.minDepth(root);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        // 构建一棵树
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(1);
        root.right.right.left.right = new TreeNode(8);

        Lc_111_二叉树的最小深度 solution = new Lc_111_二叉树的最小深度();
        int ans = solution.minDepth(root);
        Assert.assertEquals(5, ans);
    }
}
