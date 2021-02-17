package org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_算法刷题指南;

import org.issxjl2015.common.TreeNode;

/**
 * 124. 二叉树中的最大路径和
 * 路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。该路径 至少包含一个 节点，且不一定经过根节点。
 *
 * 路径和 是路径中各节点值的总和。
 *
 * 给你一个二叉树的根节点 root ，返回其 最大路径和 。
 */
public class Lc_124_二叉树中的最大路径和 {

    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        onePathSum(root);
        return ans;
    }

    public int onePathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, onePathSum(root.left));
        int right = Math.max(0, onePathSum(root.right));

        // 后续遍历
        ans = Math.max(ans, left + right + root.val);
        return Math.max(left, right) + root.val;
    }

}
