package com.company.leetcode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xu
 * @Description: 给定一个 N 叉树，返回其节点值的前序遍历。
 */
public class Npreorder {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            res.add(root.val);
            pre(root.children, res);
        }
        return res;
    }

    private List<Integer> pre(List<Node> nodes, List<Integer> list) {
        if (nodes == null) {
            return list;
        }

        for (int i = 0; i < nodes.size(); i++) {
            Node node = nodes.get(i);
            list.add(node.val);
            pre(node.children, list);
        }
        return list;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
