package org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_算法刷题指南;

import org.issxjl2015.common.TreeNode;

/**
 * 恢复二叉树————其实就是找到两个交换节点，交换过来就OK
 * 二叉搜索树的中序遍历，其元素是递增的。因此，可以确定本题可用中序遍历来解题
 * 比如：中序遍历顺序是：4,2,3,1，那么我们只要找到节点 4 和 节点 1 交换顺序即可
 *
 * 会发现这两个节点：
 * 1、第一个节点：是按照中序遍历时候前一个节点大于后一个节点
 * 2、第二个节点：是在找到第一个节点后，后面出现的前一个节点大于后一个节点
 *
 * 那么就对 BST 进行中序遍历，遍历有两种方法：迭代和递归。本题采用的就是递归。
 * 递归过程中找到这两个节点，交换即可。核心代码就是inOrder中序遍历。
 */
public class Lc_99_恢复二叉搜索树 {

    TreeNode firstNode = null;
    TreeNode secondNode = null;
    TreeNode preNode = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        inOrder(root);
        int tmp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = tmp;
    }

    public void inOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);

        // 中序遍历
        if (firstNode == null && preNode.val > root.val) {
            firstNode = preNode;
        }
        if (firstNode != null && preNode.val > root.val) {
            secondNode = root;
        }

        preNode = root;
        inOrder(root.right);
    }
}
