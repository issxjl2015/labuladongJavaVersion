package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_datastrucBaseOp.TreeNodeBaseOp;
import org.issxjl2015.common.TreeNode;
import org.junit.Test;

public class TreeNodeBaseOpTest {

    @Test
    public void test1() {
        TreeNodeBaseOp treeNodeBaseOp = new TreeNodeBaseOp();
        // 构建TreeNode
        TreeNode root = new TreeNode();
        root.val = -1;
        root.left = new TreeNode();
        root.left.val = 1;
        root.right = new TreeNode();
        root.right.val = 2;
        root.left.left = new TreeNode();
        root.left.left.val = 21;
        root.left.right = new TreeNode();
        root.left.right.val = 31;
        root.right.left = new TreeNode();
        root.right.left.val = 22;
        root.right.right = new TreeNode();
        root.right.right.val = 33;

        treeNodeBaseOp.beforeTraverse(root);
        System.out.println("----------------------");
        treeNodeBaseOp.inTraverse(root);
        System.out.println("======================");
        treeNodeBaseOp.afterTraverse(root);
    }
}
