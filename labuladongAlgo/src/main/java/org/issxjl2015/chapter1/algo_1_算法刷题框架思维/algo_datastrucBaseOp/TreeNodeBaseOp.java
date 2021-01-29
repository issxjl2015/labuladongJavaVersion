package org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_datastrucBaseOp;

import org.issxjl2015.common.TreeNode;

public class TreeNodeBaseOp {


    /***
     *     public void traverse(TreeNode root) {
     *         if (root == null) {
     *             return;
     *         }
     *
     *         // 前序遍历，那么处理逻辑写这
     *
     *         // 遍历左子树
     *         if (root.left != null) {
     *             beforeTraverse(root.left);
     *         }
     *
     *         // 中序遍历，那么处理逻辑写这
     *
     *         // 遍历右子树
     *         if (root.right != null) {
     *             beforeTraverse(root.right);
     *         }
     *
     *         // 后序遍历，那么处理逻辑写这
     *     }
     *
     *
     *
     */

    // 先序遍历
    public void beforeTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        // 打印当前节点的值
        System.out.println(root.val);
        // 遍历左子树
        if (root.left != null) {
            beforeTraverse(root.left);
        }
        // 遍历右子树
        if (root.right != null) {
            beforeTraverse(root.right);
        }
    }

    public void inTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        // 遍历左子树
        if (root.left != null) {
            inTraverse(root.left);
        }
        // 打印当前节点的值
        System.out.println(root.val);
        // 遍历右子树
        if (root.right != null) {
            inTraverse(root.right);
        }
    }


    // 后序遍历
    public void afterTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        // 遍历左子树
        if (root.left != null) {
            afterTraverse(root.left);
        }
        // 遍历右子树
        if (root.right != null) {
            afterTraverse(root.right);
        }
        // 打印当前节点的值
        System.out.println(root.val);
    }
}
