package org.issxjl2015.algorithm.Lc_104_二叉树的最大深度;

import org.issxjl2015.common.TreeNode;

public class Solution {

    int maxLevel = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, 1);
        return maxLevel;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (level > maxLevel) {
            maxLevel = level;
        }

        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }

}
