package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author
 * @Description: 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
public class PreorderTraversal {
    //非递归写法
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null) continue;
            ret.add(node.val);
            stack.push(node.right);  // 先右后左，保证左子树先遍历
            stack.push(node.left);
        }
        return ret;
    }

    //递归写法
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<Integer>();
//        preorder(root, res);
//        return res;
//    }
//
//    public void preorder(TreeNode root, List<Integer> res) {
//        if (root == null) {
//            return;
//        }
//        res.add(root.val);
//        preorder(root.left, res);
//        preorder(root.right, res);
//    }

}
