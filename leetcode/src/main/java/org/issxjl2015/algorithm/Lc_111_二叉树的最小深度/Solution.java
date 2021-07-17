package org.issxjl2015.algorithm.Lc_111_二叉树的最小深度;

import org.issxjl2015.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        // root 本身就是一层，将 level 初始化为 1
        int level = 1;

        while (!deque.isEmpty()) {
            int size = deque.size();
            // 将当前队列中所有节点向四周扩散
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                // 判断是否到达终点
                if (node.left == null && node.right == null) {
                    return level;
                }
                // 将 node 的相邻节点加入到队列
                if (node.left != null) {
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
            // 处理完当前队列后，进入下一层
            level++;
        }
        return level;
    }

}
