package org.issxjl2015.algorithm.Lc_94_二叉树的中序遍历;

import org.issxjl2015.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return ans;
        }
        if (root.left != null) {
            inorderTraversal(root.left.left);
            ans.add(root.left.val);
            inorderTraversal(root.left.right);
        }
        ans.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right.left);
            ans.add(root.right.val);
            inorderTraversal(root.right.right);
        }
        return ans;
    }
}
