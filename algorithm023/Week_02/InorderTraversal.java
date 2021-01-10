package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author
 * @Description: 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 */

public class InorderTraversal {
    //非递归写法
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            ret.add(node.val);
            cur = node.right;
        }
        return ret;
    }

    //递归写法
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<Integer>();
//        inorder(root, res);
//        return res;
//    }
//
//    public void inorder(TreeNode root, List<Integer> res) {
//        if (root == null) {
//            return;
//        }
//        inorder(root.left, res);
//        res.add(root.val);
//        inorder(root.right, res);
//    }

}
