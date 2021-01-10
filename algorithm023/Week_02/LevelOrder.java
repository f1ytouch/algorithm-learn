package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @Description: 给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
 * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔
 */
public class LevelOrder {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node1 root) {
        if (root != null) {
            traverseNode(root, 0);
        }
        return result;
    }

    private void traverseNode(Node1 node, int level) {
        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        for (Node1 child : node.children) {
            traverseNode(child, level + 1);
        }
    }
}

class Node1 {
    public int val;
    public List<Node1> children;

    public Node1() {}

    public Node1(int _val) {
        val = _val;
    }

    public Node1(int _val, List<Node1> _children) {
        val = _val;
        children = _children;
    }
}
